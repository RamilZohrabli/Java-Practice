package week02;
import java.util.Random;
import java.util.Scanner;
public class RandomPointsInCircle {
        public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int n = scan.nextInt();
        double x;
        double y;
        for (int i = 0; i < n; i++) {
         x = random.nextDouble() * 2 - 1;
         y = random.nextDouble() * 2 - 1; 
            if (x * x + y * y <= 1) {
                System.out.println("(" + x + ", " + y + ")");
            }
        }
    }
}


