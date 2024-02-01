package week02;
import java.util.Scanner;
public class Harmonic {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        double harmonicNumber = 0.0;
        scan.close();
        for(int i = 1; i<= number; i++){
            harmonicNumber = harmonicNumber + 1.0/i;
        }
        System.out.println(harmonicNumber);
    }
}
