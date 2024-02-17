package week04;
import java.util.*;
public class Task7{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        System.out.println(reverseString(input));
        scan.close();
    }
    public static String reverseString(String input) {
        StringBuilder reversedBuilder = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            reversedBuilder.append(input.charAt(i));
        }
        return reversedBuilder.toString();
    }
    
    
}