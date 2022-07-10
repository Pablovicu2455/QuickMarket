/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

public class Productos {
    
    private String item;
    private int qty;
    private double price;
    private double memprice;
    private String tax;

    public Productos() {
    }

    public Productos(String item, int qty, double price, double memprice, String tax) {
        this.item = item;
        this.qty = qty;
        this.price = price;
        this.memprice = memprice;
        this.tax = tax;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
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
        return "Productos{" + "item=" + item + ", qty=" + qty + ", price=" + price + ", memprice=" + memprice + ", tax=" + tax + '}';
    }

    public void setMemprice(String a_) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setPrice(String a_) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setQty(String a_) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
