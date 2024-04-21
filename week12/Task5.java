package week12;
import java.util.*;
class Employee{
    private String firstName;
    private int age;
    private double salary;
    public Employee(String firstName, int age, double salary){
        this.firstName = firstName;
        this.age = age;
        this.salary = salary;
    }
    public String getFirstName() {
        return firstName;
    }
    public int getAge() {
        return age;
    }
    public double getSalary() {
        return salary;
    }
    @Override
    public String toString() {
        return firstName + ", " + age + ", " + salary;
    }
}
public class Task5 {
    public static void main(String[] args) {
        Employee[] employees = {
            new Employee("Tom", 25, 50000),
            new Employee("Sara", 30, 60000),
            new Employee("Jake", 22, 45000)
        };
        Arrays.sort(employees, (e1, e2) -> e1.getFirstName().compareTo(e2.getFirstName()));
        System.out.println(Arrays.toString(employees));

        Arrays.sort(employees, (e1, e2) -> Integer.compare(e1.getAge(), e2.getAge()));
        System.out.println(Arrays.toString(employees));

        Arrays.sort(employees, (e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()));
        System.out.println(Arrays.toString(employees));
    }
}
