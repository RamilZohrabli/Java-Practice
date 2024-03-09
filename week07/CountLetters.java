package week07;
import java.util.Scanner;

public class CountLetters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] counts = null;
        String word;

        do {
            try {
                counts = new int[26];
                System.out.print("Enter a word, preferably only English letters (0 to exit): ");
                word = scan.nextLine();

                word = word.toLowerCase();

                if (word.trim().equals("0"))
                    break;

                for (int i = 0; i < word.length(); i++) {
                    char c = word.charAt(i);
                    if (Character.isLetter(c)) {
                        counts[c - 'a']++;
                    }
                }

                System.out.println("\tHere are the letters:");

                for (int i = 0; i < counts.length; i++)
                    if (counts[i] != 0)
                        System.out.println((char) (i + 'a') + ": " + counts[i]);

            } catch (Exception e) {
                // Ignore the exception and continues to execute the code with the loop
            }

        } while (true);

        scan.close();
    }
}