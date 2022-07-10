
package Classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import java.util.*;

public class Sales_Dao {
    
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public String getLatestActiveTransactionUID(){
        String sql = "SELECT * FROM transactions WHERE state='Active' ORDER BY date DESC LIMIT 1";
        try{
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            rs.next();
            return rs.getString("transactionId");
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return null;            
        }finally{
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        } 
    }
    
    public void SaveTransactionUid(String uid){
        try{
            // Transactions DB
            String sqlTrans = "INSERT INTO transactions (transactionId, state, date) VALUES (?,?,?)";
            con = cn.getConnection();
            ps = con.prepareStatement(sqlTrans);
            ps.setString(1, uid);
            ps.setString(2, "Active");
            ps.setString(3, LocalDateTime.now().toString());
            ps.execute();
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return;
            
        }finally{
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }
    }
    
    public boolean RegistrarSales(Sales sl){
        String sqlCart = "INSERT INTO cartproducts (transactionId ,item, qty, price, tax) VALUES (?,?,?,?,?)";
        try {
            con = cn.getConnection();
            
            // Cart DB
            ps = con.prepareStatement(sqlCart);
            ps.setString(1,sl.getTransactionId());
            ps.setString(2, sl.getItem());
            ps.setInt(3, sl.getQty());
            ps.setDouble(4, sl.getPrice());
            ps.setString(5, sl.getTax());
            ps.execute();
            return true;
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
            
        }finally{
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }
    }
    
   public List ListarSales(){
       List<Sales> ListaCl = new ArrayList();
       String sql = "SELECT * FROM cartproducts";
       try {
           con = cn.getConnection();
           ps = con.prepareStatement(sql);
           rs = ps.executeQuery();
           
           while (rs.next()) {               
               Sales pr = new Sales();
               //pr.setTransactionId(rs.getSt);
               pr.setItem(rs.getString("item"));
               pr.setQty(rs.getInt("qty"));
               pr.setPrice(rs.getDouble("price"));
               ListaCl.add(pr);
          
           }
       } catch (SQLException e) {
           System.out.println(e.toString());
       }
       return ListaCl;
   }
   
   public List<Sales> GetTransactionCart(String tr){
       
       String sql = "SELECT * FROM cartproducts WHERE transactionId='" + tr + "'";
       List<Sales> ListSales = new ArrayList();
       try{
           con = cn.getConnection();
           ps = con.prepareStatement(sql);
           rs = ps.executeQuery();
           while(rs.next()){
            Sales sl = new Sales();
            sl.setTransactionId(rs.getString("transactionId"));
            sl.setItem(rs.getString("item"));
            sl.setQty(rs.getInt("qty"));
            sl.setPrice(rs.getDouble("price"));
            sl.setTax(rs.getString("tax"));
            ListSales.add(sl);
           }
       }catch(SQLException e) {
           System.out.println(e.toString());
       }
       return ListSales;
   }
  
    
}
