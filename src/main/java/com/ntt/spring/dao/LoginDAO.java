package com.ntt.spring.dao;



import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.stereotype.Repository;

import com.ntt.util.ConnectionClass;

@Repository
public class LoginDAO {

	public boolean getLogin(String userName, String password) throws SQLException
	{
		Connection con=ConnectionClass.getConnection();
		Statement stmt=con.createStatement(); 
		ResultSet rs=stmt.executeQuery("select * from user1 where username= '" + userName + "' and password='" + password + "'");
		
		if(rs.next())
			return true;
		else 
			return false;
	}
}
