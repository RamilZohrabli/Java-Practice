package week02;
public class Calc {
    public static void main(String[] args) {
        int firstInt = Integer.parseInt(args[0]);
        int secondInt = Integer.parseInt(args[1]);
        int sum = firstInt+secondInt;
        int subtraction = firstInt-secondInt;
        int multiplication = firstInt*secondInt;
        int division = firstInt/secondInt;
        int remainder = firstInt%secondInt;
        System.out.println("The sum of two integers is " + sum);
        System.out.println("The subtraction of two integers is " + subtraction);
        System.out.println("The multiplication of two integers is " + multiplication);
        System.out.println("The division of two integers is " + division);
        System.out.println("The remainder of two numbers is" + remainder);
    }
}
