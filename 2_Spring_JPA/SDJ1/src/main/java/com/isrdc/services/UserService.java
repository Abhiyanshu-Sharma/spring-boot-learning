package com.isrdc.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isrdc.bos.UserBO;
import com.isrdc.repos.UserDAO;

@Service
public class UserService {
	
	@Autowired
	private UserDAO userDAO;
	
	public void saveUser(String name, Integer age) {
		UserBO userBO = new UserBO(name, age);
		userDAO.saveUser(userBO);
	}
	
	public ArrayList<UserBO> fetchAllUsers() {
		return userDAO.fetchAllUsers();
	}
}
