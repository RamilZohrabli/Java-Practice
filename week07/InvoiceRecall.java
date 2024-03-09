package week07;
import week03.invoice.Invoice;

public class InvoiceRecall {
    public static void main(String[] args) {
        try {
            Invoice invoice = new Invoice("123", "Sample description", 5, 10.0);
            System.out.println("Invoice: " + invoice);
            
            // Trying to set negative quantity
            invoice.setQuantity(-2);
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught: " + e.getMessage());
        }
    }
}
