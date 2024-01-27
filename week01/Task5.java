package week01;
import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Declaring integer variable
        int x = scanner.nextInt();
        //Getting input from the user and printing itself
        System.out.println(x);
        //Converting to hexal value
        String hexal_value_of_x = Integer.toHexString(x);
        //Printing hexal value
        System.out.println(hexal_value_of_x);

        //Converting to octal value
        String octal_value_of_x = Integer.toOctalString(x);
        //Printing octal value
        System.out.println(octal_value_of_x);

        //Declaring float type variable
        float y = scanner.nextFloat();
        //Getting input again and printing this variable
        System.out.println(y);
        //Converting to decimal floating-point and printing with printf 5 decimal points
        System.out.printf("%.5f%n", y);
        //Converting to scientific notation again with printf with 5 decimal points too
        System.out.printf("%.5e%n", y);

        scanner.close();
    }
}
