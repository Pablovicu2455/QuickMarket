package Classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Productos_Dao {
    
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    
    public boolean RegistrarProducto(Productos pr){
        String sql = "INSERT INTO inventory (item, qty, price, memprice, tax) VALUES (?,?,?,?,?)";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, pr.getItem());
            ps.setInt(2, pr.getQty());
            ps.setString(3, Double.toString(pr.getPrice()));
            ps.setString(4, Double.toString(pr.getMemprice()));
            ps.setString(5,pr.getTax());
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
    
  public List ListarProductos(){
       List<Productos> ListaCl = new ArrayList();
       String sql = "SELECT * FROM inventory";
       try {
           con = cn.getConnection();
           ps = con.prepareStatement(sql);
           rs = ps.executeQuery();
           while (rs.next()) {               
               Productos pr = new Productos();
               pr.setItem(rs.getString("item"));
               pr.setQty(rs.getInt("qty"));
               pr.setPrice(rs.getDouble("price"));
               pr.setMemprice(rs.getDouble("memprice"));
               pr.setTax(rs.getString("tax"));
               ListaCl.add(pr);
          
           }
       } catch (SQLException e) {
           System.out.println(e.toString());
       }
       return ListaCl;
   }
  
   public Productos GetProduct(String pn){
       
       String sql = "SELECT * FROM inventory WHERE item='" + pn + "'";
       Productos pr = new Productos();
       try{
           con = cn.getConnection();
           ps = con.prepareStatement(sql);
           rs = ps.executeQuery();
           rs.next();
           pr.setItem(rs.getString("item"));
           pr.setQty(rs.getInt("qty"));
           pr.setPrice(rs.getDouble("price"));
           pr.setMemprice(rs.getDouble("memprice"));
           pr.setTax(rs.getString("tax"));
       }catch(SQLException e) {
           pr.setItem("None");
           System.out.println(e.toString());
       }
       return pr;
   }
      
  
}
