package week06;
interface EvalInterface{
    double toValue();
    String toString();
}

class Operand implements EvalInterface{
    private double value;
    private String label;
    public Operand(String label, double value){
        this.label = label;
        this.value = value;
    }
    @Override
    public double toValue(){
        return value;
    }

    @Override
    public String toString(){
        return label;
    }
}

abstract class BinaryOperation implements EvalInterface{
    private EvalInterface op1;
    private EvalInterface op2;
    private String label;
    public BinaryOperation(String label, EvalInterface op1, EvalInterface op2){
        this.op1 = op1;
        this.op2 = op2;
        this.label = label;
    }
    protected abstract double calculate(EvalInterface op1, EvalInterface op2);
    @Override
    public double toValue(){
        return calculate(op1, op2);
    }
    @Override 
    public String toString(){
        return "(" + op1.toString() + " " + label + " " + op2 + ")";
    }
}
class Sum extends BinaryOperation{
    public Sum(EvalInterface op1, EvalInterface op2){
        super("+",op1,op2);
    }
    @Override 
    protected double calculate(EvalInterface op1, EvalInterface op2){
        return op1.toValue() + op2.toValue();
    }
}
// New methods by me
class Subtr extends BinaryOperation{
    public Subtr(EvalInterface op1, EvalInterface op2){
        super("-",op1,op2);
    }
    @Override 
    protected double calculate(EvalInterface op1, EvalInterface op2){
        return op1.toValue() - op2.toValue();
    }
}
class Mult extends BinaryOperation{
    public Mult(EvalInterface op1, EvalInterface op2){
        super("*",op1,op2);
    }
    @Override 
    protected double calculate(EvalInterface op1, EvalInterface op2){
        return op1.toValue() * op2.toValue();
    }
}
class Div extends BinaryOperation{
    public Div(EvalInterface op1, EvalInterface op2){
        super("/",op1,op2);
    }
    @Override 
    protected double calculate(EvalInterface op1, EvalInterface op2){
        return op1.toValue() / op2.toValue();
    }
}



//Establishing Unary operation
abstract class UnaryOperation implements EvalInterface{
    private EvalInterface number;
    private String label;
    public UnaryOperation(String label, EvalInterface number){
        this.number = number;
        this.label = label;
    }
    protected abstract double calculate(EvalInterface number);
    @Override
    public double toValue(){
        return calculate(number);
    }
    @Override
    public String toString(){
        return label + number;
    }

} 
class SquareRoot extends UnaryOperation{
    public SquareRoot(EvalInterface number){
        super("\u221A",number);
    }
    @Override
    protected double calculate(EvalInterface number){
        double value = number.toValue();
        return Math.sqrt(value);
    }
}
class Factorial extends UnaryOperation{
    public Factorial(EvalInterface number){
        super("Factorial of ",number);
    }
    @Override 
    protected double calculate(EvalInterface number) {
        int value = (int) number.toValue();
        int factorial = 1;
        for (int i = 1; i <= value; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
//Testing
public class Task10{
    public static void main(String[] args) {
        //Binary operations
        Operand x = new Operand("x", 5);
        Operand y = new Operand("y", 15);
        Operand z = new Operand("z", 3);
        //Testing sum 
        Sum s = new Sum(x,y);
        Sum s2 = new Sum(s,z);
        System.out.println(s.toString());
        System.out.println(s.toValue());
        System.out.println(s2.toString());
        System.out.println(s2.toValue());
        //Testing subtraction
        Subtr sub1 = new Subtr(x,y);
        Subtr sub2 = new Subtr(sub1, z);
        System.out.println(sub1.toString());
        System.out.println(sub1.toValue());
        System.out.println(sub2.toString());
        System.out.println(sub2.toValue());
        //Testing multiplication
        Mult multiply1 = new Mult(x,y);
        Mult multiply2 = new Mult(multiply1,z);
        System.out.println(multiply1.toString());
        System.out.println(multiply1.toValue());
        System.out.println(multiply2.toString());
        System.out.println(multiply2.toValue());
        //Testing division
        Div division1 = new Div(x,y);
        Div division2 = new Div(division1,z);
        System.out.println(division1.toString());
        System.out.println(division1.toValue());
        System.out.println(division2.toString());
        System.out.println(division2.toValue());

        //Unary operations
        Operand n = new Operand("n", 16);
        SquareRoot sqrt = new SquareRoot(n);
        System.out.println(sqrt.toString());
        System.out.println(sqrt.toValue());
        Factorial factorial = new Factorial(n);
        System.out.println(factorial.toString());
        System.out.println(factorial.toValue());
    }
}