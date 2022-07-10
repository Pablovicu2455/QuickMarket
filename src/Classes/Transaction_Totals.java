package Classes;

/**
 *
 * @author vpabl
 */
public class Transaction_Totals {
    
    private int totalItemsSold;
    private double subtotal;
    private double tax;
    private double total;
    
    public Transaction_Totals(){
        
    }
    
    public Transaction_Totals(int totalItemsSold, double subtotal, double tax, double total){
        this.totalItemsSold = totalItemsSold;
        this.subtotal = subtotal;
        this.tax = tax;
        this.total = total;
    }
    
    public int getTotalItemsSold() {
        return totalItemsSold;
    }

    public void setTotalItemsSold(int totalItemsSold) {
        this.totalItemsSold = totalItemsSold;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
