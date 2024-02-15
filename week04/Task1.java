package week04;
public class Task1{
    public static void main(String[] args) {
        //a)
        for(String arg : args){
             System.out.print(arg + " ");
        }
        System.out.println();
        int[] numbers = new int[args.length];
        //b)
        for(int i = 0; i < args.length; i++){
            numbers[i] = Integer.parseInt(args[i]);
        }
    
        printIntArray(numbers);
        System.out.println();
        Sum(numbers);
    }
    //b) i.
    public static void printIntArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
    
    //b) ii.
    public static void Sum(int[] arrayIntegers){
        int sum = 0; 
        for(int number : arrayIntegers){
            sum = sum + number;
        }
        System.out.println(sum);
    }

}