package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateDemo {

	public static void main(String[] args) {
		
		try {
			Class.forName("oracle.jdbc.driver.oracleDriver");
	 	
		    Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
		    
		    Statement stmt =con.createStatement();
		    
		    stmt.execute("create table student (roll no number(2) primary key ,name varchar2(10) , marks number(3)");
		    
		    
		    
		    
		    
		    
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
        catch (SQLException e) {
            System.out.println("Database connection failed!");
            e.printStackTrace();
        
	}
	}
}