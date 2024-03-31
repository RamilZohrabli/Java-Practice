package week09;
import java.util.*;

public class Task5 {
    private static Map<String, Set<Character>> cache = new HashMap<>();

    public static void main(String[] args) {
        String input = "hello";

        System.out.println(uniqueCharacters(input));
    }

    public static Set<Character> uniqueCharacters(String input) {
        if (!cache.containsKey(input)) {
            cache.put(input, calculateUniqueCharacters(input));
        }
        return cache.get(input);
    }

    private static Set<Character> calculateUniqueCharacters(String input) {
        Set<Character> uniqueChars = new HashSet<>();
        for (char ch : input.toCharArray()) {
            uniqueChars.add(ch);
        }
        return uniqueChars;
    }
}
