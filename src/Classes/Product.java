
package Classes;

public class Product {
    
    private int id;
    private String item;
    private int qty;
    private double regprice;
    private double memprice;
    private String tax;
   
    

    public Product() {
    }

    public Product(int id, String item, int qty, double regprice, double memprice, String tax) {
        this.id = id;
        this.item = item;
        this.qty = qty;
        this.regprice = regprice;
        this.memprice = memprice;
        this.tax = tax;
    }

   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
   
    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getRegprice() {
        return regprice;
    }

    public void setRegprice(double regprice) {
        this.regprice = regprice;
    }

    public double getMemprice() {
        return memprice;
    }

    public void setMemprice(double memprice) {
        this.memprice = memprice;
    }

    public String getTax() {
        return tax;
    }

    public void setTax(String tax) {
        this.tax = tax;
    }

    @Override
    public String toString() {
        return "Productos{" + "id=" + id+ "item=" + item + ", qty=" + qty + ", price=" + regprice + ", memprice=" + memprice + ", tax=" + tax + '}';
    }
}
