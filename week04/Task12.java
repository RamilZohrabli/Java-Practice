package week04;
import java.util.Scanner;
public class Task12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String string = scan.nextLine();
        String sub = scan.nextLine();
        int index = findSubstringIndex(string, sub);
        if (index != -1) {
            System.out.println(index);
        } else {
            System.out.println("-1");
        }
        scan.close();
    }

    public static int findSubstringIndex(String string, String sub) {
        for (int i = 1; i <= string.length() - sub.length(); i++) {
            if (string.regionMatches(i, sub, 0, sub.length())) {
                return i;
            }
        }
        return -1;
    }
    
}
