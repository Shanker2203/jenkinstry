package com.ntt.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionClass {
	public static Connection con=null;
	public static Connection getConnection() {
		
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			 con=(Connection) DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/mysql","root","Nttdata@123");  
			  
			
			}catch(Exception e){ System.out.println(e);}  
		return con;
			}  
	
	
	void closeConnection(Connection con) throws SQLException {
		
		con.close(); 

		
	}


	
	
	

}
