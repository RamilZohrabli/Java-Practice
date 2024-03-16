package week08;
import java.util.*;
public class Task2 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(1);
        numbers.add(7);
        numbers.add(8);
        numbers.add(3);
        // i. Collections.sort()
        Collections.sort(numbers);
        System.out.println(numbers);
        // ii.List.sort()
        numbers.sort(null);
        System.out.println(numbers);
        // iii. Comparator interface
        // 1. 
        Comparator<Integer> comparator = new Comparator<Integer>(){
            @Override
            public int compare(Integer x1, Integer x2){
                return x1.compareTo(x2);
            }
        };
        numbers.sort(comparator);
        System.out.println(numbers);
        // 2.
        Comparator<Integer> Compare = new CustomComparator();
        numbers.sort(Compare);
        System.out.println(numbers);
    }
    static class CustomComparator implements Comparator<Integer> {
        @Override 
        public int compare(Integer x1, Integer x2){
            return x1.compareTo(x2);
        }
    }
}
