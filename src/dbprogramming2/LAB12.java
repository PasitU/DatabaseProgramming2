package dbprogramming2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;


public class LAB12 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydb2";
        String username = "root";
        String password = "mysql@sit";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url,username,password);
            PreparedStatement preparedStatement= connection.prepareStatement("INSERT INTO student "
                    + "(studentID, firstName, lastName, email, deptID) " + 
                    "values (?,?, ?, ?, ?)");
            preparedStatement.setString(1, "17164");
            preparedStatement.setString(2, "Pasit");
            preparedStatement.setString(3, "Udompanich");
            preparedStatement.setString(4, "pasit.mail");
            preparedStatement.setString(5, "IT");
            preparedStatement.execute();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LAB12.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(LAB12.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
