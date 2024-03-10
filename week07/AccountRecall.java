package week07;
import java.util.Scanner;
class Customer {
    private int ID;
    private String name;
    private char gender;

    public Customer(int ID, String name, char gender) {
        this.ID = ID;
        this.name = name;
        this.gender = gender;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return name + "(" + ID + ")";
    }
}

class Account extends Customer{
    private int id;
    private Customer customer;
    private double balance;

    public Account(int id, int customerID, String name, char gender, double balance) {
        super(customerID, name, gender);
        this.id = id;
        this.balance = balance;
    }

    public Account(int id, int customerID, String name, char gender) {
        this(id, customerID, name, gender, 0.0);
    }

    public int getID() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String toString() {
        return "Account ID: " + id + ", " + customer + ", Balance: $" + String.format("%.2f", balance);
    }

    public String getCustomerName() {
        return customer.getName();
    }

    public Account withdraw(double amount) {
        if (amount > balance) {
            throw new InvalidAmountException("Withdrawal amount cannot be more than the balance");
        }
        balance -= amount;
        return this;
    }

    public Account deposit(double amount) {
        balance += amount;
        return this;
    }
}

public class AccountRecall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Account ID:");
        int accountId = scanner.nextInt();
        scanner.nextLine(); 
        
        System.out.println("Customer ID:");
        int customerId = scanner.nextInt();
        scanner.nextLine(); 
        
        System.out.println("Customer name:");
        String customerName = scanner.nextLine();
        
        System.out.println("Customer gender:");
        char customerGender = scanner.next().charAt(0);
        scanner.nextLine();
        
        System.out.println("Initial balance:");
        double initialBalance = scanner.nextDouble();
        
        Account account = new Account(accountId, customerId, customerName, customerGender, initialBalance);
        
        try {
            System.out.println("Current balance: $" + account.getBalance());
            
            System.out.println("Amount to withdraw:");
            double withdrawAmount = scanner.nextDouble();
            account.withdraw(withdrawAmount);
            
            System.out.println("New balance after withdrawal: $" + account.getBalance());
        } catch (InvalidAmountException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}