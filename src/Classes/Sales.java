
package Classes;


public class Sales {
    
    private String transactionId;
    private String item;
    private int qty;
    private double price;
    
    
    
 public Sales() {
    }
 
    public Sales(String transactionId, String item, int qty, double price, String tax) {
        
        this.transactionId= transactionId;
        this.item = item;
        this.qty = qty;
        this.price = price;
  
     }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public void setPrice(double price) {
        this.price = price;
    }
   

    public String getTransactionId() {
        return transactionId;
    }

    public String getItem() {
        return item;
    }

    public int getQty() {
        return qty;
    }

    public double getPrice() {
        return price;
    }
  
    
    
    
    
    
    
    
    
    
    
}
    

