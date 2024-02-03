package week02;
import java.util.Scanner;
public class ArmstrongNumbers {
    static int power(int base, int exp) {
        int result = 1;
        for(int i = 1; i<=exp; i++){
            result = result *base;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int Integer = scan.nextInt();
        int counter = 0;
        while(Integer > 0){
            counter++;
            Integer = Integer /10;
        }
        int sum = 0;
        while(Integer > 0){
            sum = sum + power(Integer%10, counter);
            Integer = Integer /10;
        }
        if(sum == Integer){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
        scan.close();
    }
}
