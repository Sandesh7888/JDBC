package jdbc;
//contro+shift+o  packeages

//alt+shift+z     try catch
import java.sql.*;

public class InserDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","scott","tiger");
			
			Statement stmt=con.createStatement();
			stmt.executeUpdate("insert into student values(1,'sandesh',123)");
			System.out.print("insert successfull");
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 

	}

}
