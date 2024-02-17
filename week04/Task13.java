package week04;
import java.util.Scanner;
public class Task13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        printingAllSlices(word);
        scan.close();
    }
    public static void printingAllSlices(String word){
        for(int i = 1; i<word.length(); i++){
            String firstSlice = word.substring(0,i);
            String secondSlice = word.substring(i);
            System.out.println(firstSlice + " " + secondSlice);
        }
        System.out.println(word);
    }
    
}
