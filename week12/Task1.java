package week12;
@FunctionalInterface
interface AFuncInt{
    abstract void apply(String x);
    static void print(String x){
        System.out.println(x);
    }
    default void print(String x, String y){
        System.out.println(x + " " + y);
    }
}
public class Task1{
    public static void main(String[] args){
        AFuncInt instanceOfAnonymous = new AFuncInt(){
            @Override
            public void apply(String x){}
        };
        instanceOfAnonymous.apply("Text");
        instanceOfAnonymous.print("Hello", "World");
        AFuncInt instanceOfLambda = (y) -> {
            System.out.println(y);
        };
        instanceOfLambda.apply("Text");
        instanceOfLambda.print("Hello", "World");
        //Static method:
        AFuncInt.print("Hello"); // I used interface name here because it is static
    }
}
