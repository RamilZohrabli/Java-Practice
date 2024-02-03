package week02;
import java.util.Scanner;
public class PrintingPatters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        String[][] Array = new String[number][number];
        for(int i = 0; i<number ; i++){
            for(int j = 0; j<number; j++){
                if(i%2 == 0 && j%2 == 0){
                    Array[i][j] = "*";
                }
                else {
                    Array[i][j] = "#";
                }
            }
        }
        for(int i = 0; i<number-1; i++){
            for(int j = 0; j<number; j++){
                System.out.print(Array[i][j] + " ");
            }
            System.out.println();
        }
        scan.close();
    }
}
