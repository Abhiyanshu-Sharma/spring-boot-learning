package com.isrdc.serives;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isrdc.entities.Aadhar;
import com.isrdc.entities.User;
import com.isrdc.repos.UserRepo;

@Service
public class UserService {

	private UserRepo userRepo;
	
	public UserService() {
		
	}
	
	@Autowired
	public UserService(UserRepo userRepo) {
		this.userRepo = userRepo;
	}
	
	public void saveUser() {
		Aadhar a = new Aadhar();
		a.setAadharNumber("5678-3423-7856");
		a.setIssueDate(LocalDate.now());
		a.setIssueAuthority("ABC");
		
		User u = new User();
		u.setUserName("Mr Pratap");
		u.setUserEmail("prata@gmail.com");
		u.setUserPhone("7867564534");
		
		u.setAadhar(a);
		a.setUser(u);
		
		userRepo.save(u);
	}
	
	public void showUser() {
		System.out.println(userRepo.findById(1));
	}
}
