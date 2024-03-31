package week09;
import java.util.*;
public class Task4 {
    private static Map<String, Map<Character, Integer>> cache = new HashMap<>();

    public static void main(String[] args) {
        String input = "hello";

        System.out.println("Most frequent character: " + mostFrequentCharacter(input));
        System.out.println("Least frequent character: " + leastFrequentCharacter(input));
    }

    public static char mostFrequentCharacter(String input) {
        if (!cache.containsKey(input)) {
            cache.put(input, calculateCharacterFrequency(input));
        }
        Map<Character, Integer> frequencyMap = cache.get(input);
        char mostFrequentChar = ' ';
        int maxFrequency = Integer.MIN_VALUE;
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                maxFrequency = entry.getValue();
                mostFrequentChar = entry.getKey();
            }
        }
        return mostFrequentChar;
    }

    public static char leastFrequentCharacter(String input) {
        if (!cache.containsKey(input)) {
            cache.put(input, calculateCharacterFrequency(input));
        }
        Map<Character, Integer> frequencyMap = cache.get(input);
        char leastFrequentChar = ' ';
        int minFrequency = Integer.MAX_VALUE;
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() < minFrequency) {
                minFrequency = entry.getValue();
                leastFrequentChar = entry.getKey();
            }
        }
        return leastFrequentChar;
    }

    private static Map<Character, Integer> calculateCharacterFrequency(String input) {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char ch : input.toCharArray()) {
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }
        return frequencyMap;
    }
}
