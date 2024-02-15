package week04;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        int[] integers;
        if(args.length > 0){
        integers = new int[args.length];
        for(int i = 0; i < args.length; i++){
            integers[i] = Integer.parseInt(args[i]);
        }
        System.out.println(maximumInteger(integers));
        System.out.println(minimumInteger(integers));
        }
        else {
        Scanner scan = new Scanner(System.in);
        int sizeOfArray = scan.nextInt();
        integers = new int[sizeOfArray];
        for(int i = 0; i<sizeOfArray; i++){
            integers[i] = scan.nextInt();
        }
        scan.close();
    }
    System.out.println(maximumInteger(integers));
    System.out.println(minimumInteger(integers));
    System.out.println(bothMinimumAndMaximum(integers));
}
    public static int maximumInteger(int[] Integers){
        int maximum = Integers[0];
        for(int i = 1; i< Integers.length; i++){
            if(Integers[i] > maximum){
                maximum = Integers[i];
            }
        }
        return maximum;
    }
    public static int minimumInteger(int[] Integers){
        int minimum = Integers[0];
        for(int i = 1; i<Integers.length; i++){
            if(Integers[i]<minimum){
                minimum = Integers[i];
            }
        }
        return minimum;
    }
    public static int[] bothMinimumAndMaximum(int[] Integers){
        int maximum = Integers[0];
        int minimum = Integers[0];
        for(int i = 1; i<Integers.length; i++){
            if(Integers[i]>maximum){
                maximum = Integers[i];
            }
            if(Integers[i]<minimum){
                minimum = Integers[i];
            }
        }
        return  new int[] {minimum, maximum};
    }
}
