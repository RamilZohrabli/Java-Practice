package week03.math;

import java.util.Scanner;

public class ComplexNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double real = scanner.nextDouble();
        float imag = scanner.nextFloat();

        ComplexNumber complexNumber = new ComplexNumber(real, imag);

        System.out.println(complexNumber);
        ComplexNumber adder = new ComplexNumber(2, 3);
        complexNumber.add(adder);
        System.out.println(adder + ":" + complexNumber);

        ComplexNumber subtractor = new ComplexNumber(1, 2);
        complexNumber.sub(subtractor);
        System.out.println(subtractor + ":" + complexNumber);

        ComplexNumber multiplier = new ComplexNumber(2, 1);
        complexNumber.mult(multiplier);
        System.out.println(multiplier + ":" + complexNumber);

        ComplexNumber conjugate = new ComplexNumber(complexNumber.re(), -complexNumber.imag());
        System.out.println("Conjugate: " + conjugate);
        //Extra
        int exponent = scanner.nextInt();
        double[] result = complexNumber.exponentiation(exponent);
        System.out.println("Exponentiation result: (" + result[0] + " + " + result[1] + "i)");
        scanner.close();
    }
}
