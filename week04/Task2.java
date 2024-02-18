package week04;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int[] integers;
        if (args.length > 0) {
            integers = new int[args.length];
            for (int i = 0; i < args.length; i++) {
                integers[i] = Integer.parseInt(args[i]);
            }
        } else {
            Scanner scan = new Scanner(System.in);
            int sizeOfArray = scan.nextInt();
            integers = new int[sizeOfArray];
            for (int i = 0; i < sizeOfArray; i++) {
                integers[i] = scan.nextInt();
            }
            scan.close();
        }
    
        System.out.println("Maximum: " + maximumInteger(integers));
        System.out.println("Minimum: " + minimumInteger(integers));
    
        int[] minMax = bothMinimumAndMaximum(integers);
        System.out.println("Both Minimum and Maximum: " + minMax[0] + ", " + minMax[1]);
    }
    

    public static int maximumInteger(int[] integers) {
        int maximum = integers[0];
        for (int i = 1; i < integers.length; i++) {
            if (integers[i] > maximum) {
                maximum = integers[i];
            }
        }
        return maximum;
    }

    public static int minimumInteger(int[] integers) {
        int minimum = integers[0];
        for (int i = 1; i < integers.length; i++) {
            if (integers[i] < minimum) {
                minimum = integers[i];
            }
        }
        return minimum;
    }

    public static int[] bothMinimumAndMaximum(int[] integers) {
        int maximum = integers[0];
        int minimum = integers[0];
        for (int i = 1; i < integers.length; i++) {
            if (integers[i] > maximum) {
                maximum = integers[i];
            }
            if (integers[i] < minimum) {
                minimum = integers[i];
            }
        }
        return new int[]{minimum, maximum};
    }
}