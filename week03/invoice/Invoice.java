package week03.invoice;

public class Invoice {
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
}
