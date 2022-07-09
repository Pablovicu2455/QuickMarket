
package Classes;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {

    Connection con;

    public Connection getConnection() {
        try {
            String myBD = "jdbc:mysql://localhost:3306/quickmark?serverTimezone=UTC";
            con = DriverManager.getConnection(myBD, "pablo", "pablo");   
            JOptionPane.showMessageDialog(null," Conexion con MySQL : Correcta");
            return con;
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return null;
    }

}
