package week02;
import java.util.Random;
public class RollingDie {
    public static void main(String[] args) {
        Random randomNumber = new Random();
        double probability = randomNumber.nextDouble();
        int res;
        if(probability < 1.0 / 8){
            res = randomNumber.nextInt(4) + 1;
        }
        else{
            res = randomNumber.nextInt(2) + 5;
        }
        System.out.println(res);
    }
}
