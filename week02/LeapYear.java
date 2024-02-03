package week02;
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int yearNumber = scan.nextInt();
        if ((yearNumber % 400 == 0)||(yearNumber % 4 == 0)  && (yearNumber % 100 != 0)){
            System.out.println("This is leap year");
        }
        else{
            System.out.println("This is not leap year");
        }
        scan.close();
    }
}
