package week13;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Task1 {

    private static final String FILE_PATH = "file.txt"; // Path to the text file

    // Method to create a sample file with test data
    private static void createTestFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH))) {
            writer.write("The quick brown fox jumps over the lazy dog.\n");
            writer.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit.\n");
            writer.write("The goal is to count words, with tokens longer than 3 symbols.\n");
            writer.write("This file has multiple lines with varied lengths and contents.\n");
            writer.write("Concurrent and sequential word counting will be tested.\n");
            writer.write("Some lines are short, while others contain more words.\n");
            writer.write("To test concurrency, chunks of 300 lines will be assigned to threads.\n");
            writer.write("Join all threads to ensure completion and measure the time taken.\n");
            writer.write("It's a good exercise for parallel programming and performance analysis.\n");
            writer.write("Let's create this file and then proceed with word counting.\n");
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Test file created at: " + FILE_PATH);
    }

    // Method to count words sequentially (without concurrency)
    private static int countWordsSequential() {
        int wordCount = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] tokens = line.split("\\s+");
                for (String token : tokens) {
                    if (token.length() > 3) {
                        wordCount++;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return wordCount;
    }

    // Worker for counting words concurrently in chunks
    private static class WordCountWorker implements Callable<Integer> {
        private final List<String> lines;

        public WordCountWorker(List<String> lines) {
            this.lines = lines;
        }

        @Override
        public Integer call() {
            int count = 0;
            for (String line : lines) {
                String[] tokens = line.split("\\s+");
                for (String token : tokens) {
                    if (token.length() > 3) {
                        count++;
                    }
                }
            }
            return count;
        }
    }

    // Method to count words concurrently (with threads)
    private static int countWordsConcurrent() {
        List<Future<Integer>> results = new ArrayList<>();
        ExecutorService executor = Executors.newFixedThreadPool(4);
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {
            List<String> lines = new ArrayList<>();
            String line;
            int lineCounter = 0;

            while ((line = br.readLine()) != null) {
                lines.add(line);
                lineCounter++;

                if (lineCounter == 300) {
                    results.add(executor.submit(new WordCountWorker(lines)));
                    lines.clear(); // Reset the list for the next chunk
                    lineCounter = 0;
                }
            }

            if (!lines.isEmpty()) {
                results.add(executor.submit(new WordCountWorker(lines)));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        int totalWordCount = 0;
        for (Future<Integer> result : results) {
            try {
                totalWordCount += result.get();
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }

        executor.shutdown(); // Shutdown the executor after all tasks are completed
        return totalWordCount;
    }

    // Main method
    public static void main(String[] args) {
        createTestFile(); // Create the test file with sample content

        // Sequential word count
        long startTime = System.currentTimeMillis();
        int sequentialWordCount = countWordsSequential();
        long endTime = System.currentTimeMillis();
        System.out.println("Sequential word count: " + sequentialWordCount);
        System.out.println("Time taken (ms): " + (endTime - startTime));

        // Concurrent word count
        startTime = System.currentTimeMillis();
        int concurrentWordCount = countWordsConcurrent();
        endTime = System.currentTimeMillis();
        System.out.println("Concurrent word count: " + concurrentWordCount);
        System.out.println("Time taken (ms): " + (endTime - startTime));
    }
}
