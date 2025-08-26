package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectionDemo {

	public static void main(String[] args) {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","Sandesh_Karad","tiger");
			
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from student"); 
			ResultSetMetaData rm =rs.getMetaData();
			int n= rm.getColumnCount();
			 for(int i=0;i<=n;i++) {
				System.out.print(rm.getColumnName(i));
			 }
			 System.out.println();
			 while(rs.next()) {
				 System.out.println(rs.getInt(1)+"\t");
				 System.out.println(rs.getString(2)+"\t");
				 System.out.println(rs.getInt(3));
			 }
					
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}

	}

}
