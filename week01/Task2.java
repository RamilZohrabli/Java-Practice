package week01;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);

         int a = scan.nextInt();
         int b = scan.nextInt();
         int c = scan.nextInt();

         int sum = a+b+c;

         System.out.println(sum);

         scan.close();
    }
    
    
}
