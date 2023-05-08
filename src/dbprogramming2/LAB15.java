package dbprogramming2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSetMetaData;

public class LAB15 {
    public static void main(String[] args) {
            String url = "jdbc:mysql://localhost:3306/mydb2";
    String username = "root";
    String password = "mysql@sit";

        try {
            Class.forName ("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement= connection.createStatement();
            String sql = "select * from mydb2.student";
            ResultSet results = statement.executeQuery(sql);
            
            ResultSetMetaData rsMData = results.getMetaData();
            for (int i= 1; i<= rsMData.getColumnCount(); i++){
                System.out.printf("%-15s\t",rsMData.getColumnName(i));
            }
            System.out.println("");
            while(results.next()){
                for(int i = 1; i < rsMData.getColumnCount(); i++){
                    System.out.printf("%-12s\t", results.getObject(i));
                }
                System.out.print("\n");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            
        }
    }
}
