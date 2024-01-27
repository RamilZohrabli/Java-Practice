package week01;

import java.util.Scanner;

public class Task3 {
     public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         //a. Changing data types
         int a = scan.nextInt();
         float b = scan.nextFloat();
         long c = scan.nextLong();
         //b.Their sum    
         double sum = a + b + c;
         //c. The data type of sum should be double because it has wider range and avoid overflow and underflow
      
         //d. Printing sum
         System.out.println(sum);
         

         scan.close();
    }
}
