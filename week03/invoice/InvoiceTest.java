package week03.invoice;
import java.util.Scanner;
public class InvoiceTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String partNumber = scan.nextLine();
        String description = scan.nextLine();
        int quantityOfItem = scan.nextInt();
        scan.nextLine();
        double pricePerItem = scan.nextDouble();

        Invoice invoice = new Invoice(partNumber, description, quantityOfItem,pricePerItem);
        System.out.println(invoice.getPartNumber());
        System.out.println(invoice.getPartDescription());
        System.out.println(invoice.getQuantity());
        System.out.println(invoice.getPrice());

        System.out.println(invoice.getInvoiceAmount());



        System.out.println(invoice.getInvoiceAmount());

        scan.close();
    }    
}
