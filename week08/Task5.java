package week08;
import java.util.*;
public class Task5 {
    public static void main(String[] args){
        int[] bread = {4,2, 3, 5};
        int totalBreads = 7;
        int personsCanBuyBread = calculateNumber(bread,totalBreads);
        System.out.println(personsCanBuyBread);
    }
    public static int calculateNumber(int[] bread, int totalBreads){
        Queue<Integer> queue = new LinkedList<>();
        for(int x : bread){
            queue.offer(x);
        }
        int personsCanBuyBread = 0;
        while(!queue.isEmpty()){
            int requiredBread = queue.poll();
            if(totalBreads>=requiredBread){
                totalBreads = totalBreads - requiredBread;
                personsCanBuyBread++;
            }
            else{
                break;
            }
        }
        return personsCanBuyBread;
        
    }
}
