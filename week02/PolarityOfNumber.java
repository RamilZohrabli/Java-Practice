package week02;
import java.util.Scanner;
public class PolarityOfNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double number = scan.nextDouble();
        if(number > 0.0){
            System.out.println("positive");
        }
        if(number == 0.0){
            System.out.println("neutral");
        }
        if(number < 0.0){
            System.out.println("negative");
        }
        scan.close();
    }
}
