package week10;
import java.util.*;
class Pair<T, U> {
    private final T first;
    private final U second;
    private String comment;

    public Pair(T first, U second, String comment) {
        this.first = first;
        this.second = second;
        this.comment = comment;
    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "(" + first + ", " + second + ") - Comment: " + comment;
    }
}

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("First item for Pair 1:");
        String firstItem1 = scanner.nextLine();
        System.out.println("Second item for Pair 1:");
        int secondItem1 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Comment for Pair 1:");
        String comment1 = scanner.nextLine();

        System.out.println("First item for Pair 2:");
        double firstItem2 = scanner.nextDouble();
        scanner.nextLine(); 
        System.out.println("Second item for Pair 2:");
        String secondItem2 = scanner.nextLine();
        System.out.println("Comment for Pair 2:");
        String comment2 = scanner.nextLine();

        Pair<String, Integer> pair1 = new Pair<>(firstItem1, secondItem1, comment1);
        Pair<Double, String> pair2 = new Pair<>(firstItem2, secondItem2, comment2);

        System.out.println("Pair 1: " + pair1);
        System.out.println("Pair 2: " + pair2);

        scanner.close(); 
    }
}
