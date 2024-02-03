package week02;

import java.util.Scanner;
public class MinMax {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float number = scan.nextFloat();
        float max = number;
        float min = number;
        while(scan.hasNextFloat()){
            number = scan.nextFloat();
            if(number < min){
                min = number;
            }
            else if(number > max){
                max = number;
            }
        }
        System.out.println(min);
        System.out.println(max);
        scan.close();
    }
}