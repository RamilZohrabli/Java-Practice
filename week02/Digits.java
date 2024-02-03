package week02;
import java.util.Scanner;
public class Digits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int Integer = scan.nextInt();
        int sum = 0;
        int product = 1;
        int counter = 0;
        while(Integer!=0){
            sum = sum + (Integer%10);
            product = product * (Integer%10);            
            Integer = Integer / 10;
            counter++;
        }
        double average = (double)sum/counter;
        System.out.println(sum);
        System.out.println(product);
        System.out.println(average);
    }
}
