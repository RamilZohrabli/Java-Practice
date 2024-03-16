package week08;
import java.util.*;
public class Task6 {
    public static void main(String[] args) {
        int[] bread = {5,3,2,4};
        int totalBreads = 8;
        int personsCanBuyBread = calculateNumber(bread, totalBreads);
        System.out.println(personsCanBuyBread);
    }
    public static int calculateNumber(int[] bread, int totalBreads){
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for(int x:bread){
            priorityQueue.offer(x);
        }
        int personsCanBuyBread = 0;
        while(!priorityQueue.isEmpty()){
            totalBreads = totalBreads - priorityQueue.poll();
            personsCanBuyBread++;
        }
        return personsCanBuyBread;
    }
}
