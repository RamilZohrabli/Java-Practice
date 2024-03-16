package week08;
import java.util.*;
// a) Account class
class Account implements Comparable<Account>{
    // a) i. fields: firstName, lastName, balance
    private String firstName;
    private String lastName;
    private double balance;
    // a) ii. constructor
    public Account(String firstName, String lastName, double balance){
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
    }
    public String getName(){
        return firstName;
    }
    public String getSurname(){
        return lastName;
    }
    public double getBalance(){
        return balance;
    }
    // a) iii. toString() method
    @Override
    public String toString() {
        return String.format("Account{firstName='%s', lastName='%s', balance=%.2f}",
                             firstName, lastName, balance);
    }
    // d) i. the method for sorting by fullname
    @Override
    public int compareTo(Account another){
        String thisFullName = this.firstName + this.lastName;
        String anotherFullName = another.firstName + another.lastName;
        return thisFullName.compareTo(anotherFullName);
    }   
}
public class Task3 {
    public static void main(String[] args){
        // b) List for adding elements
        List<Account> accountList = new ArrayList<>();
        accountList.add(new Account("Ramil", "Zohrabli", 1000));
        accountList.add(new Account("John", "Smith", 2000));
        accountList.add(new Account("Mike","Johnson", 4000));
        // c) printing elements with for-each loop
        for(Account account : accountList){
            System.out.println(account);
        }
        // d) i. sorting elements based on fullname (firstname + lastname)
        Collections.sort(accountList);
        for(Account account :accountList){
            System.out.println(account);
        }
        // d) ii. sorting elements based on balance
        Comparator<Account> balanceCompare = Comparator.comparingDouble( Account:: getBalance);
        accountList.sort(balanceCompare);
        for(Account account : accountList){
            System.out.println(account);
        }
    }
}
