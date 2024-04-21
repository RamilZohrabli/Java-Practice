package week12;
@FunctionalInterface
interface Calculator{
    double calculate(double a, double b);
}
public class Task3 {
    public static void main(String[] args) {
        Calculator addition = (a,b) -> {return a + b;};
        Calculator subtraction = (a,b) -> {return a - b;};
        Calculator multiplication = (a,b) -> {return a * b;};
        Calculator division = (a,b) -> {return a / b;};
        Calculator exponentiation = (a,b) -> {return Math.pow(a,b);};
        System.out.println(addition.calculate(1, 2));
        System.out.println(subtraction.calculate(4, 2));
        System.out.println(multiplication.calculate(3, 4));
        System.out.println(division.calculate(4, 2));
        System.out.println(exponentiation.calculate(2, 4));
    }
}
