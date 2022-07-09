package Classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Product_Dao {
    
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    
    public boolean RegistrarProducto(Product pr){
        String sql = "INSERT INTO productos (item, quantity, regPrice, memPrice, tax) VALUES (?,?,?,?,?)";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);

            ps.setString(0, pr.getItem());
            ps.setInt(1, pr.getQty());
            ps.setDouble(2, pr.getRegprice());
            ps.setDouble(3, pr.getMemprice());
            ps.setString(4,pr.getTax());
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
       List<Product> ListaP = new ArrayList();
       String sql = "SELECT * FROM productos";
       try {
           con = cn.getConnection();
           ps = con.prepareStatement(sql);
           rs = ps.executeQuery();
           
           
           while (rs.next()) {               
               Product pr = new Product();
               
               pr.setId(rs.getInt("id"));
               pr.setItem(rs.getString("item"));
               pr.setQty(rs.getInt("qty"));
               pr.setRegprice(rs.getDouble("price"));
               pr.setMemprice(rs.getDouble("memprice"));
               pr.setTax(rs.getString("tax"));
               ListaP.add(pr);
          
           }
       } catch (SQLException e) {
           System.out.println(e.toString());
       }
       return ListaP;
   }
    
  
}
