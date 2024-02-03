package week02;
import java.util.Scanner;
public class TaylorSin {
    static int fact(int n){
        int res = 1;
        for(int i = 1; i<=n; i++){
            res = res * i;
        }
        return res;
    }
    static double power(double base, int exp){
        double res = 1.0;
        for(int i = 0; i<exp; i++){
            res = res *base;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        double sinx = 0;
        double angle = scan.nextDouble();
        int terms = scan.nextInt();
        int sign;
        for (int i = 0; i < terms; i++){
            if(i%2 == 0){
                sign = 1;
            }
            else {
                sign = -1;
            }
            double term = sign * power(angle, 2* i + 1) / fact(2*i +1);
            sinx = sinx +term;
        }
        System.out.println(sinx);
        scan.close();
        System.out.println(Math.sin(angle));
    }
}
