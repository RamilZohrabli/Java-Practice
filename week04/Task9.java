package week04;
import java.util.*;
public class Task9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        sortString(input);
        scan.close();
    }
    public static void sortString(String input){
        char[] characterArray = input.toCharArray();
        Arrays.sort(characterArray);
        for(int i= 0; i< characterArray.length; i++){
            System.out.print(characterArray[i]);
        }
    }
}
