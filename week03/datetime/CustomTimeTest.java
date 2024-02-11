package week03.datetime;

import java.util.Scanner;

public class CustomTimeTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int hour = scan.nextInt();
        int minute = scan.nextInt();
        int second = scan.nextInt();

        CustomTime time = new CustomTime(hour, minute, second);

        System.out.println(time.toUniversalString());
        System.out.println(time.toStandardString());

        scan.close();
    }
}
