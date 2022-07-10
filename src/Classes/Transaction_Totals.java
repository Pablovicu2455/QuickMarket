package Classes;

import java.util.List;

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
    
    public static Transaction_Totals CalculateTransactionTotals(List<Sales> salesInTransaction, double tax){
	
	int totalItemsSold = 0;
	double subtotal = 0.0;
	double taxTotal = 0.0;
	double finalTotal = 0.0;
	
	// Go through all items and calculate totals
	for(Sales item : salesInTransaction){
            // Item tax 
            if(item.getTax().compareTo("Taxable") == 0){
                    taxTotal += item.getPrice()*item.getQty()*tax;
            }

            // Add price for subtotal
            subtotal = subtotal + (item.getPrice()*item.getQty());

            // Increment items sold
            totalItemsSold += item.getQty();
	}
	
	finalTotal = subtotal + taxTotal;
	
	Transaction_Totals transactionTotals = new Transaction_Totals(totalItemsSold, subtotal, taxTotal, finalTotal);
	
	return transactionTotals;
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
