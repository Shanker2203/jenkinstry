package com.ntt.spring.service;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ntt.spring.dao.SignupDAO;
@Service
public class SignupService {
	@Autowired
	private SignupDAO SignupDAO;

	public boolean sign(String userName, String password) throws SQLException {
		boolean result = SignupDAO.signUp(userName, password);

		if (result)
			return true;
		else
			return false;

	}

}
