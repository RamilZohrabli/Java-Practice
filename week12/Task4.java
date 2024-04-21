package week12;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;

public class Task4 {
    public static void main(String[] args) {
        Supplier<List<Integer>> numberSupplier = () -> Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> numbers = numberSupplier.get();

        Function<Integer, Integer> squareFunction = (x) -> x * x;

        List<Integer> squaredNumbers = numbers.stream()
                .map(squareFunction)
                .collect(Collectors.toList());

        Predicate<Integer> isEvenPredicate = (x) -> x % 2 == 0;

        Consumer<Integer> printEven = (x) -> {
            if (isEvenPredicate.test(x)) {
                System.out.println("Even number: " + x);
            }
        };

        squaredNumbers.forEach(printEven);

        Consumer<List<Integer>> printAll = (list) -> {
            System.out.println("All squared numbers:");
            list.forEach(System.out::println);
        };

        printAll.accept(squaredNumbers);
    }
}
