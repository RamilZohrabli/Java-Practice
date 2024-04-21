package week12;
import java.util.*;
@FunctionalInterface
interface SpecificProperty<T>{
    boolean check(T item);
}
class Point {
    double x, y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
class Person {
    String firstname, lastname;
    int age;
    public Person(String firstname, String lastname, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }
}
class Utility{
    public static <T> Collection<T> filter(Collection<T> c, SpecificProperty<T> p) {
        Collection<T> filteredCollection = new ArrayList<>(); 
        for (T item : c) {
            if (p.check(item)) { filteredCollection.add(item);}
        }
        return filteredCollection;
    }
}
public class Task2{
    public static void main(String[] args) {
        // a.
        SpecificProperty<Integer> isOdd1 = (x) -> x%2 != 0;
        SpecificProperty<Point> isInFirstQuadrant = (point) -> point.x > 0.0 && point.y > 0.0;
        SpecificProperty<String> isPangram = (s) -> {
            String lowerCase = s.toLowerCase();
            for (char c = 'a'; c <= 'z'; c++) {
                if (lowerCase.indexOf(c) == -1) {
                    return false;
                }
            }
            return true;
        };
        SpecificProperty<Person> isOlderThan20 = (person) -> person.age > 20;
        System.out.println(isOdd1.check(3)); 
        System.out.println(isInFirstQuadrant.check(new Point(3, 4)));
        System.out.println(isPangram.check("The quick brown fox jumps over the lazy dog"));
        System.out.println(isOlderThan20.check(new Person("Ramil", "Zohrabli", 18))); 
        // b.
        Collection<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        SpecificProperty<Integer> isOdd2 = (x) -> x % 2 != 0;

        Collection<Integer> oddNumbers = Utility.filter(numbers, isOdd2);

        System.out.println(oddNumbers);

    }
}