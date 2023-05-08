package dbprogramming2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LAB10 {
    public static void main(String[] args) {
                    String url = "jdbc:mysql://localhost:3306/mydb2";
        String username = "root";
        String password = "mysql@sit";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            statement.execute("Update student set email = 'pasit.udom@kmutt.com' where studentID = '17161'");

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(LAB08.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
