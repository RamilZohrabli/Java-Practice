package week02;
import java.util.Scanner;
public class Average {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number;
        int sum = 0;
        int counter = 0;
        double average;
        while(scan.hasNextInt()){
            number = scan.nextInt();
            sum = sum + number;
            counter++;
        }
        scan.close();
        if(counter != 0){
            average = (double) sum/counter;
            System.out.println(average);
        }
        else if(counter == 0){
            System.out.println("Error");
        }
    }
}
