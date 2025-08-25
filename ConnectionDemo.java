package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDemo {

    public static void main(String[] args) {
        try {
            // Load Oracle JDBC Driver
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // Create Connection (Update host, port, serviceName, username, password)
            Connection con = DriverManager.getConnection(
            		 "jdbc:oracle:thin:@localhost:1521:orcl",
            	    "scott",
            	    "tiger"
            	);

            System.out.println("Connection established successfully!");

            con.close();
        } 
        catch (ClassNotFoundException e) {
            System.out.println("Oracle JDBC Driver not found!");
            e.printStackTrace();
        } 
        catch (SQLException e) {
            System.out.println("Database connection failed!");
            e.printStackTrace();
        }
    }
}
