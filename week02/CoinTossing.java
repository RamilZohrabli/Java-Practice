package week02;
import java.util.Scanner;
public class CoinTossing {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int head = 0;
        int tail = 0;
        for(int i = 0; i<n; i++){
            if(Math.random() < 0.5){
                head++;
            }
            else{
                tail++;
            }
        }
        double headProbability = (double) head / n;
        double tailProbability = (double) tail / n;
        System.out.println(headProbability);
        System.out.println(tailProbability);
    }
}
