package com.isrdc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isrdc.entities.User;
import com.isrdc.repos.UserRepo;

@Service
public class UserService {
	private UserRepo userRepo;
	
//	Because we have only one constructor 
//	@Autowired
	public UserService(UserRepo userRepo) {
		this.userRepo = userRepo;
	}
	
	public void saveUser(Integer userId, String name, Integer age) {
		User user = new User(userId, name, age);
		
		userRepo.save(user);
	}
}
