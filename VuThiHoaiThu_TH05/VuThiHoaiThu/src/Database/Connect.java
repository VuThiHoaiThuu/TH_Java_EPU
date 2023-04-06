/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Vũ Thị Hoài Thu
 */
public class Connect {
    public static String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    public static String user = "sa";
    public static String password = "031003";
    public static String con_str = "jdbc:sqlserver://localhost:1433;databaseName=QLSanpham;encrypt=false"; 
    
    public static Connection conn;
    
    public Connection connect() throws SQLException{
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(con_str, user, password);
            
            
            return conn;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Kết nối csdl thất bại", "Thông báo", 1);
        }       
        return null;
    }
}
