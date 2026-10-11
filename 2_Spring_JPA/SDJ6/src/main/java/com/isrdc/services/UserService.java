package com.isrdc.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isrdc.entities.User;
import com.isrdc.repos.UserRepo;

@Service
public class UserService {
	private UserRepo userRepo;
	

	@Autowired
	public void setUserService(UserRepo userRepo) {
		this.userRepo = userRepo;
	}
	
	public void existUserById() {
		System.out.println(userRepo.existsById(2));
		System.out.println(userRepo.existsById(5));
	}
	
	public void countAllUsers() {
		long count = userRepo.count();
		
		System.out.println(count + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}	
	
	public void fetchUserById() {
		Optional<User> user = userRepo.findById(3);
		
		if(user.isPresent())
			System.out.println(user.get() + " ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ ");
	}
	
	public void saveAllUsers() {
		User u1 = new User(1, "Suryawanshi", "vaibhav@gmail.com", "123456");
		User u2 = new User(2, "Kohli", "virat@gmail.com", "23456");
		User u3 = new User(3, "Tendulkar", "sachin@gmail.com", "345678");
		User u4 = new User(4, "Sharma", "sachin@gmail.com", "345678");
		
//		Aam Zindagi
//		ArrayList<User> users = new ArrayList<>();
//		
//		users.add(u1);
//		users.add(u2);
//		users.add(u3);
//		users.add(u4);
//		
//		
//		userRepo.saveAll(users);
		
//		Khas Zindagi
		userRepo.saveAll(Arrays.asList(u1,u2,u3,u4));
	}
}
