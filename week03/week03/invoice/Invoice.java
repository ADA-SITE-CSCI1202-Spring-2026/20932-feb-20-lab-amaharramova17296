package week03.invoice;

public class Invoice {
    private String partNum;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

     public Invoice(String partNum, String partDescription, int quantity, double pricePerItem) {
        this.partNum = partNum;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }
    public String getNum() {
        return partNum;
    }

    public void setNum(String partNum) {
        this.partNum = partNum;
    }
    
    public String getDescription() {
          return partDescription;
    }

    public void SetDescription(String partDescription) {
        this.partDescription = partDescription;
    }
    
     public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return pricePerItem;
    }

    public void setPrice(double pricePerItem) {
        this.pricePerItem = pricePerItem;
    }

public double getInvoiceAmount() {
    return quantity * pricePerItem;
}
}
