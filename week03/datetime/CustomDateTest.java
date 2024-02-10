package week03.datetime;
import java.util.Scanner;
public class CustomDateTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int month1 = scan.nextInt();
        int day1 = scan.nextInt();
        int year1 = scan.nextInt();
        CustomDate date1 = new CustomDate(month1, day1, year1);

        int month2 = scan.nextInt();
        int day2 = scan.nextInt();
        int year2 = scan.nextInt();
        CustomDate date2 = new CustomDate(month2, day2, year2);
        scan.close();
        
        date1.displayDate();
        System.out.println(date1.displayFormatted());

        date2.displayDate();
        System.out.println(date2.displayFormatted());

        int difference = date1.difference(date2);
        System.out.println(difference);

        int comparison = CustomDate.compare(date1, date2);
        if (comparison > 0) {
            System.out.println("Date 1 is earlier than Date 2.");
        } else if (comparison < 0) {
            System.out.println("Date 2 is earlier than Date 1.");
        } else {
            System.out.println("Date 1 and Date 2 are the same.");
        }
    }
}
