package week10;
import java.util.*;

public class Task4 {
    int accountNumber;
    String accountHolder;
    double balance;

    public Task4(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    
    public static <T> int countElementsWithProperty(Collection<T> collection, PropertyChecker<T> checker) {
        int count = 0;
        for (T element : collection) {
            if (checker.check(element)) {
                count++;
            }
        }
        return count;
    }

    public static void testEvenIntegers() {
        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int count = countElementsWithProperty(Arrays.asList(numbers), new EvenIntegerChecker());
        System.out.println("Even integers: " + count);
    }

    public static void testPalindromeStrings() {
        String[] strings = {"radar", "hello", "level", "world", "deified"};
        int count = countElementsWithProperty(Arrays.asList(strings), new PalindromeStringChecker());
        System.out.println("Palindrome strings: " + count);
    }

    public static void testEmptyAccounts() {
        List<Task4> accounts = new ArrayList<>();
        accounts.add(new Task4(123, "John", 0));
        accounts.add(new Task4(456, "Smith", 100));
        accounts.add(new Task4(789, "Jane", 0));
        int count = countElementsWithProperty(accounts, new EmptyAccountChecker());
        System.out.println("Empty accounts: " + count);
    }



    public interface PropertyChecker<T> {
        boolean check(T element);
    }

    public static class EvenIntegerChecker implements PropertyChecker<Integer> {
        @Override
        public boolean check(Integer element) {
            return element % 2 == 0;
        }
    }

    public static class PalindromeStringChecker implements PropertyChecker<String> {
        @Override
        public boolean check(String element) {
            String reversed = new StringBuilder(element).reverse().toString();
            return element.equals(reversed);
        }
    }

    public static class EmptyAccountChecker implements PropertyChecker<Task4> {
        @Override
        public boolean check(Task4 account) {
            return account.balance == 0;
        }
    }
    public static void main(String[] args) {
        testEvenIntegers();
        testPalindromeStrings();
        testEmptyAccounts();
    }
}
