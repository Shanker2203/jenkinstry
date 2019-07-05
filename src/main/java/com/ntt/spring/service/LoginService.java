package com.ntt.spring.service;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ntt.spring.dao.LoginDAO;

@Service
public class LoginService {
	@Autowired
	private LoginDAO loginDAO;

	public boolean login(String userName, String password) throws SQLException {
		boolean result = loginDAO.getLogin(userName, password);

		if (result)
			return true;
		else
			return false;

	}

}
