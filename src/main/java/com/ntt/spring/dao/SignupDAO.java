package com.ntt.spring.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.stereotype.Repository;

import com.mysql.cj.protocol.Resultset;
import com.ntt.util.ConnectionClass;
@Repository
public class SignupDAO {
	public boolean signUp(String userName, String password) throws SQLException
	{
		Connection con=ConnectionClass.getConnection();
		Statement stmt=con.createStatement(); 
		
		
		
		String sql = "insert into user1 values('" + userName +"','" +password +"')";
		
		
  int rs= stmt.executeUpdate(sql);
		
		
		if(rs>0)
			return true;
		else 
			return false;
	}

}
