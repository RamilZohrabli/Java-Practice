package week02;
import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int seconds = scan.nextInt();
        int remainingSeconds;
        int remainingSeconds2;
        int minutes;
        int hours;

        hours = seconds / 3600;
        remainingSeconds = seconds % 3600;
        minutes = remainingSeconds / 60;
        remainingSeconds2 = remainingSeconds % 60;

        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + minutes);
        System.out.println("Seconds: " + remainingSeconds2);

        scan.close();
    }
}
