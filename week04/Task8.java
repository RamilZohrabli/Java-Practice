package week04;
import java.util.*;
public class Task8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        explodeAndPrint(input);
        scan.close();
    }
    public static void explodeAndPrint(String input) {
        StringBuilder substr = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            substr.append(input.charAt(i));
            System.out.print(substr.toString());
            }
            System.out.println();
    }
 }
    


