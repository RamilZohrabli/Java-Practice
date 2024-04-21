package week12;
import java.util.*;
import java.util.stream.*;

public class Task6 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        boolean allEven = numbers.stream().allMatch(x -> x % 2 == 0);
        System.out.println("All numbers even? " + allEven);

        boolean anyEven = numbers.stream().anyMatch(x -> x % 2 == 0);
        System.out.println("Any number even? " + anyEven);

        boolean noneNegative = numbers.stream().noneMatch(x -> x < 0);
        System.out.println("None of the numbers are negative? " + noneNegative);

        long count = numbers.stream().count();
        System.out.println("Total count of numbers: " + count);

        Stream<Double> randomNumbers = Stream.generate(Math::random).limit(5);
        System.out.println("Generated random numbers:");
        randomNumbers.forEach(System.out::println);

        Optional<Integer> first = numbers.stream().findFirst();
        first.ifPresent(f -> System.out.println("First number: " + f));

        Optional<Integer> any = numbers.stream().findAny();
        any.ifPresent(a -> System.out.println("Any number: " + a));

        List<Integer> evenNumbers = numbers.stream()
            .filter(x -> x % 2 == 0)
            .sorted()
            .collect(Collectors.toList());
        System.out.println("Even numbers (sorted): " + evenNumbers);

        List<String> mappedNumbers = numbers.stream()
            .map(x -> "Number: " + x)
            .collect(Collectors.toList());
        System.out.println("Mapped numbers: " + mappedNumbers);

        int sum = numbers.stream().reduce(0, Integer::sum);
        System.out.println("Sum of all numbers: " + sum);
    }
}
