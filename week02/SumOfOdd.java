package week02;
import java.util.Scanner;
public class SumOfOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstInt = scan.nextInt();
        int seccondInt = scan.nextInt();
        int sum = 0;
        for(int i = firstInt; i <= seccondInt; i++){
            if(i%2 ==1){
                sum = sum +i;
            }
        }
        scan.close();
        System.out.println(sum);
    }
}
