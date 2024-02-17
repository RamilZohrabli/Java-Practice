package week04;
import java.util.Scanner;
public class Task11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();
        String modifiedSentence = swapFirstAndLastLetter(sentence);
        System.out.println(modifiedSentence);
        scan.close();
    }

    public static String swapFirstAndLastLetter(String sentence) {
        StringBuilder modifiedSentence = new StringBuilder();
        for (String word : sentence.split("\\s+")) {
            if (!word.isEmpty()) {
                char firstChar = word.charAt(0);
                char lastChar = word.charAt(word.length() - 1);
                modifiedSentence.append(lastChar).append(word.substring(1, word.length() - 1)).append(firstChar).append(" ");
            } else {
                modifiedSentence.append(" ");
            }
        }
        return modifiedSentence.toString().trim();
    }
}
