package week09;
import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();

        long startTime1 = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            int num = random.nextInt(1000);
            addInSortedOrder(list1, num);
        }
        long endTime1 = System.currentTimeMillis();
        System.out.println((endTime1 - startTime1));

        long startTime2 = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            list2.add(random.nextInt(1000));
        }
        Collections.sort(list2);
        long endTime2 = System.currentTimeMillis();
        System.out.println((endTime2 - startTime2));
    }

    public static void addInSortedOrder(LinkedList<Integer> list, int num) {
        ListIterator<Integer> iterator = list.listIterator();
        while (iterator.hasNext()) {
            if (num <= iterator.next()) {
                iterator.previous();
                iterator.add(num);
                return;
            }
        }
        list.add(num);
    }
}
