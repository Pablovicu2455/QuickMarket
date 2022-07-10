
package Classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import java.util.*;

public class Sales_Dao {
    
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public boolean RegistrarSales(Sales sl){
        String sql = "INSERT INTO cartproducts (transactionId ,item, qty, price, tax) VALUES (?,?,?,?,?)";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            
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
  
    
}
