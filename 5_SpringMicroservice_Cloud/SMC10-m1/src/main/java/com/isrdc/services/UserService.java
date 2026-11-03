package com.isrdc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isrdc.entities.User;
import com.isrdc.repos.UserRepo;

@Service
public class UserService {

	@Autowired
	private UserRepo userRepo;
	
	public void saveUser(User user) {
		userRepo.save(user);
	}
	
	public Iterable<User> fetchUsers() {
		return userRepo.findAll();
	}
}
