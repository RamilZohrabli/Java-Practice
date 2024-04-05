package week10;
import java.util.*;
class Generics <T extends Number> {
    private T number;
    public Generics(T number){
        this.number = number;
    }
    public double reciprocal(){
        if (number.doubleValue() == 0.0) {
            throw new ArithmeticException("Cannot find reciprocal if it is zero");
        }
        return 1.0 / number.doubleValue();
    }
    public double fraction(){
        return Math.abs(number.doubleValue() % 1);
    }
    public double absValueOfDouble(){
        return Math.abs(number.doubleValue());
    }
    public float absValueOfFloat(){
        return Math.abs(number.floatValue());
    }
}
public class Task2{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x = scan.nextDouble();
        Generics<Double> gc = new Generics<>(x);
        System.out.println(gc.reciprocal());
        System.out.println(gc.fraction());
        System.out.println(gc.absValueOfDouble());
        System.out.println(gc.absValueOfFloat());
        scan.close();

    }
}


