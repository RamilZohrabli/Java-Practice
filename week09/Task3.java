package week09;
import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        String input = "hello";

        printCharactersWithIndexes(input, true);
        printCharactersWithIndexes(input, false);
    }

    public static void printCharactersWithIndexes(String input, boolean ascending) {
        TreeMap<Character, List<Integer>> map = new TreeMap<>();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            map.computeIfAbsent(ch, k -> new ArrayList<>()).add(i);
        }

        map.forEach((ch, indexes) -> {
            System.out.print(ch + ": ");
            indexes.forEach(index -> System.out.print(index + ", "));
            System.out.println();
        });
    }
}
