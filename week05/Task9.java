package week05;
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
        if (balance >= amount) {
            balance -= amount;
        }
        return this;
    }

    public Account deposit(double amount) {
        balance += amount;
        return this;
    }
}
