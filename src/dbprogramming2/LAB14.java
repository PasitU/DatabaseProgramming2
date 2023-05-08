package dbprogramming2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DatabaseMetaData;


public class LAB14 {
    public static void main(String[] args) {
         String url = "jdbc:mysql://localhost:3306/mydb2";
        String username = "root";
        String password = "mysql@sit";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, username, password);
            DatabaseMetaData dbMetaData = connection.getMetaData();
            System.out.println(dbMetaData.getURL());
            System.out.println(dbMetaData.getDatabaseProductName());
            System.out.println(dbMetaData.getDatabaseProductVersion());
            System.out.println(dbMetaData.getDriverName());
            System.out.println(dbMetaData.getDriverVersion());
            System.out.println(dbMetaData.getDriverMajorVersion());
            System.out.println(dbMetaData.getDriverMinorVersion());
            System.out.println(dbMetaData.getMaxConnections());
            System.out.println(dbMetaData.getMaxTableNameLength());
            System.out.println(dbMetaData.getMaxColumnNameLength());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LAB12.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(LAB12.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
