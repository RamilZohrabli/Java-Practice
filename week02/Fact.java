package week02;
import java.util.Scanner;
public class Fact {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int result = 1;
        while(number>=1){
            result = result * number;
            number--;
        }
        System.out.println(result);
    }
}
