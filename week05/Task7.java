package week05;
public class Task7 {
    
    public static int min(int a, int b){
        if(a<b){
        return a;
        }
        else
        return b;
    }
    public static int max(int a, int b){
        if(a>b){
            return a;
        }
        else
        return b;
    }
    public static int sum(int[] args){
        int sum = 0;
        for(int i = 0; i< args.length; i++){
            sum = sum + args[i];
        }
        return sum;
    }
    public static float mean(int [] args){
        float sum = 0.0f;
        int counter = 0;
        for(int i = 0; i<args.length; i++){
            sum = sum + args[i];
            counter++;
        }
        float mean = sum / counter;
        return mean;
    }
    public static int factorial(int n){
        int fact = 1;
        for(int i = 1; i<= n; i++){
            fact = fact * i;
        }
        return fact;
    }
    public static void main(String[] args) {
        int [] array = new int[args.length];
        for(int i = 0; i<args.length; i++){
            array[i] = Integer.parseInt(args[i]);
        }

        System.out.println(mean(array));
    }
}
