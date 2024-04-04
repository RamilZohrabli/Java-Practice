package week10;
import week03.geometry.Point;
import java.util.*;
class Task{
    private String s;
    public Task(String s){
        this.s = s;
    }
    public String getS(){
        return s;
    }
    @Override
    public String toString(){
        return s;
    }
}
class Generics {
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static <T> void printArray(T[] array, int lowerIndex, int upperIndex) {
        if (lowerIndex < 0 || upperIndex >= array.length || lowerIndex > upperIndex) {
            throw new IllegalArgumentException("Invalid range");
        }
        for (int i = lowerIndex; i <= upperIndex; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void printArray(Task[] array) {
        for (int i = 0; i < array.length; i += 2) {
            if (i + 1 < array.length) {
                System.out.println(array[i] + " " + array[i + 1]);
            } else {
                System.out.println(array[i]);
            }
        }
    }

    public static <T> T getMiddleElement(T[] array) {
        return array[array.length / 2];
    }

    public static <T extends Comparable<T>> T getMaxElement(T[] array) {
        if (array == null || array.length == 0) {
            return null;
        }
        T max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(max) > 0) {
                max = array[i];
            }
        }
        return max;
    }

    public static <T extends Comparable<T>> void bubbleSort(T[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    T temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static <T> void swap(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer[] arrIntegers = new Integer[5];
        Double[] arrDoubles = new Double[5];
        String[] arrStrings = new String[5];
        Task[] arrTasks = new Task[5];
        Point[] arrPoints = new Point[5];

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            arrIntegers[i] = scanner.nextInt();

            System.out.println(i);
            arrDoubles[i] = scanner.nextDouble();

            System.out.println(i);
            arrStrings[i] = scanner.next();

            System.out.println(i);
            arrTasks[i] = new Task(scanner.next());

            System.out.println(i);
            int x = scanner.nextInt();
            System.out.println(i);
            int y = scanner.nextInt();
            arrPoints[i] = new Point(x, y);
        }

        scanner.close();

        Generics.printArray(arrIntegers);
        Generics.printArray(arrDoubles);
        Generics.printArray(arrStrings);
        Generics.printArray(arrTasks);
        Generics.printArray(arrPoints);

    }
}
