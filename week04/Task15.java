package week04;
import java.util.Scanner;
import week03.invoice.Invoice;
public class Task15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfInvoices =scan.nextInt();
        scan.nextLine();
        Invoice[] invoices = new Invoice[numberOfInvoices];
        for(int i = 0; i<numberOfInvoices; i++){
            String partNumber = scan.nextLine();
            String description = scan.nextLine();
            int quantityOfItem = scan.nextInt();
            double pricePerItem = scan.nextDouble();
            scan.nextLine();
            invoices[i] = new Invoice(partNumber, description, quantityOfItem, pricePerItem);
        }
        for(int i = 0; i<numberOfInvoices; i++){
            System.out.println(invoices[i].getInvoiceAmount());
        }
        scan.close();
    }
}
