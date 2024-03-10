package week07;

import java.util.Scanner;

class Invoice {
    private String partNumber;
    private String description;
    private int quantityOfItem;
    private double pricePerItem;
    public Invoice (String partNumber, String description, int quantityOfItem, double pricePerItem){
        this.partNumber = partNumber;
        this.description = description;
        setQuantity(quantityOfItem);
        setPriceItem(pricePerItem);
    }
    public String getPartNumber(){
        return partNumber;
    }
    public String getPartDescription(){
        return description;
    }
    public int getQuantity(){
        return quantityOfItem;
    }
    public double getPrice(){
        return pricePerItem;
    }
    public void setPartNumber(String partNumber){
        this.partNumber = partNumber;
    }
    public void setPartDescription(String description){
        this.description = description;
    }
    public void setQuantity(int quantityOfItem){
        if(quantityOfItem > 0){
            this.quantityOfItem = quantityOfItem;
        }
        else{
            quantityOfItem = 0;
        }
    }
    public void setPriceItem(double pricePerItem){
        if(pricePerItem > 0.0){
            this.pricePerItem = pricePerItem;
        }
        else{
            pricePerItem = 0.0;
        }
    }
    public double getInvoiceAmount(){
        return quantityOfItem * pricePerItem;
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Part Number: %s, Description: %s, Quantity: %d, Price: %.2f", partNumber, description, quantityOfItem, pricePerItem));
        return sb.toString();
    }
}

public class InvoiceRecall {
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try {
            System.out.println("Part number:");
            String partNumber = scan.nextLine();

            System.out.println("Description:");
            String description = scan.nextLine();

            System.out.println("Quantity of item:");
            int quantityOfItem = scan.nextInt();
            scan.nextLine(); 
            //Checking if the number of item is negative
            if (quantityOfItem < 0) {
                throw new IllegalArgumentException("Quantity cannot be negative");
            }

            System.out.println("Price per item:");
            double pricePerItem = scan.nextDouble();
            //Checking if the price negative
            if (pricePerItem < 0) {
                throw new IllegalArgumentException("Price per item cannot be negative");
            }

            Invoice invoice = new Invoice(partNumber, description, quantityOfItem, pricePerItem);

            System.out.println("Part Number: " + invoice.getPartNumber());
            System.out.println("Part Description: " + invoice.getPartDescription());
            System.out.println("Quantity: " + invoice.getQuantity());
            System.out.println("Price: " + invoice.getPrice());

            System.out.println("Invoice Amount: " + invoice.getInvoiceAmount());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scan.close();
        }
    }
}

