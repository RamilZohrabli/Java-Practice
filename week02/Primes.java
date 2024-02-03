package week02;
import java.util.Scanner;
public class Primes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println(primeChecker(number)); 
        scan.close();   
    }

static boolean primeChecker(int number){
    for(int i = 2; i*i<=number; i++){
        if(number %i == 0){
            return false;
        }
    }
    if(number <= 1){
        return false;
    }
    else {
        return true;
    } 
    
  }
 
}