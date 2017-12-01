package sapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {
	public static com.mysql.jdbc.Connection getConnection() 
	{
		Connection con=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost/management","root","");
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
		return (com.mysql.jdbc.Connection) con;
		
	}
	

}
