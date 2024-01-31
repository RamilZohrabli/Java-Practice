package week02;
import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstInt = scan.nextInt();
        int secondInt = scan.nextInt();
        int sum = firstInt+secondInt;
        System.out.println(sum);
        scan.close();
    }
}
