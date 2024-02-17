package week04;
import java.util.Arrays;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word1 = scanner.nextLine();
        String word2 = scanner.nextLine();

        if (areAnagrams(word1, word2)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        scanner.close();
    }

    public static boolean areAnagrams(String word1, String word2) {
        char[] charArray1 = word1.toCharArray();
        char[] charArray2 = word2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        return Arrays.equals(charArray1, charArray2);
    }
}

