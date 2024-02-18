package week04;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Task6 { 
    public static List<Integer> sieve(int n) {
    boolean[] isPrime = new boolean[n + 1];
    for (int i = 2; i <= n; i++) {
        isPrime[i] = true;
    }
    
    for (int p = 2; p * p <= n; p++) {
        if (isPrime[p]) {
            for (int i = p * p; i <= n; i += p) {
                isPrime[i] = false;
            }
        }
    }
    
    List<Integer> primes = new ArrayList<>();
    for (int i = 2; i <= n; i++) {
        if (isPrime[i]) {
            primes.add(i);
        }
    }
    
        return primes;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        List<Integer> primes = sieve(n);
        System.out.println("Prime numbers up to " + n + ": " + primes);
        scan.close();
    }
}
