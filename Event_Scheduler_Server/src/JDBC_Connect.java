import java.sql.*;
import javax.swing.*;

public class JDBC_Connect {
    public static Connection ConnectDB() {
        try {
                    Class.forName("com.mysql.jdbc.Driver");
            Connection conn= DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/student","root","root");
            
            return conn;
        } catch(Exception e){
             JOptionPane.showMessageDialog(null,"Error");  
            return null;
        }
      
    }

}
