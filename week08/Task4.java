package week08;
import java.util.*;
public class Task4 {
    public static void main(String[] args) {
        // a) Array with names (also duplicate ones)
        String[] arrayOfNames = {"Karim", "Ramil", "Rahim", "Rahim"};
        // b) i. Retaining and printing the words wtih LinkedHashSet
        Set<String> names = new LinkedHashSet<>(Arrays.asList(arrayOfNames));
        System.out.println(names);
        // b) Ordering by default int alphabetical order with the TreeSet
        Set<String> namesSortedinOrder = new TreeSet<>(names);
        System.out.println(namesSortedinOrder);
    }
}
