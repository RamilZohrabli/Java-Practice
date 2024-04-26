package week13;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

class WordCounter {
    public static int countValidWords(String line) {
        String[] words = line.split("\\s+"); 
        int count = 0;
        for (String word : words) {
            if (word.replaceAll("[^a-zA-Z]", "").length() > 3) { 
                count++;
            }
        }
        return count;
    }

    public static void countWordsSequential(String filePath) throws IOException {
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(filePath));
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filePath);
            return;  
        }

        int totalWordCount = 0;
        long startTime = System.nanoTime();  

        String line;
        while ((line = reader.readLine()) != null) {
            totalWordCount += countValidWords(line);
        }

        reader.close(); 

        long endTime = System.nanoTime();  
        long duration = TimeUnit.NANOSECONDS.toMillis(endTime - startTime);  // Convert to milliseconds

        System.out.println("Total word count (Sequential): " + totalWordCount);
        System.out.println("Time taken (Sequential): " + duration + " ms");
    }

    // Thread class to count words in a given chunk
    public static class WordCountThread extends Thread {
        private List<String> lines;
        private int wordCount;

        public WordCountThread(List<String> lines) {
            this.lines = lines;
        }

        @Override
        public void run() {
            wordCount = 0;
            for (String line : lines) {
                wordCount += countValidWords(line);  // Count words with more than three symbols
            }
        }

        public int getWordCount() {
            return wordCount;  // Get the total word count for this thread
        }
    }

    // Concurrent approach to count words with multithreading
    public static void countWordsConcurrent(String filePath) throws IOException, InterruptedException {
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(filePath));
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filePath);
            return;  // Exit if the file doesn't exist
        }

        List<String> lines = new ArrayList<>();
        String line;

        // Read all lines into a list
        while ((line = reader.readLine()) != null) {
            lines.add(line);
        }
        reader.close(); 

        int chunkSize = 300;
        List<List<String>> chunks = new ArrayList<>();
        for (int i = 0; i < lines.size(); i += chunkSize) {
            chunks.add(lines.subList(i, Math.min(i + chunkSize, lines.size())));
        }

        List<WordCountThread> threads = new ArrayList<>();
        long startTime = System.nanoTime();

        for (List<String> chunk : chunks) {
            WordCountThread thread = new WordCountThread(chunk);
            threads.add(thread);
            thread.start();
        }

        for (WordCountThread thread : threads) {
            thread.join(); 
        }

        int totalWordCount = 0;
        for (WordCountThread thread : threads) {
            totalWordCount += thread.getWordCount();
        }

        long endTime = System.nanoTime(); 
        long duration = TimeUnit.NANOSECONDS.toMillis(endTime - startTime);  // Convert to milliseconds

        System.out.println("Total word count (Concurrent): " + totalWordCount);
        System.out.println("Time taken (Concurrent): " + duration + " ms");
    }
}

public class Task1 {
    public static void main(String[] args) throws IOException, InterruptedException {
        String filePath = "file.txt"; 

        System.out.println("Sequential approach:");
        try {
            WordCounter.countWordsSequential(filePath);  
        } catch (IOException e) {
            System.out.println("Error in sequential approach: " + e.getMessage());
        }

        System.out.println("\nConcurrent approach:");
        try {
            WordCounter.countWordsConcurrent(filePath);  
        } catch (IOException | InterruptedException e) {
            System.out.println("Error in concurrent approach: " + e.getMessage());
        }
    }
}
