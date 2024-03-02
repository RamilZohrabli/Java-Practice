package week06;
import java.util.Scanner;
import java.math.BigInteger;

public class Task8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Factorial
        int n = scan.nextInt();
        BigInteger factorial = calculateFactorial(n);
        System.out.println(factorial);

        // Power
        BigInteger base = scan.nextBigInteger();
        int exp = scan.nextInt();
        BigInteger result = calculatePower(base, exp);
        System.out.println(base + "^" + exp + "= " + result);
        scan.close();
    }

    public static BigInteger calculateFactorial(int n) {
        BigInteger factorial = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        return factorial;
    }

    public static BigInteger calculatePower(BigInteger base, int exp) {
        return base.pow(exp);
    }
}

