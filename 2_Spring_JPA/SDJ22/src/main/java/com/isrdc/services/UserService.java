package com.isrdc.services;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isrdc.entities.Transaction;
import com.isrdc.entities.User;
import com.isrdc.repos.UserRepo;

@Service
public class UserService {

	@Autowired
	private UserRepo userRepo;
	
	public void deleteUser() {
		userRepo.deleteById(1);
	}
	
	public void showUser() {
		Optional<User> userOpt = userRepo.findById(1);
		
		if(userOpt.isPresent()) {
			User user = userOpt.get();
			System.out.println(user);
		}
	}
	
	public void saveUser() {
		User user = new User("Umesh Singh", "umesh@gmail.com", "451234");
		
		Transaction t1 = new Transaction("A5597T11", LocalDate.now());
		Transaction t2 = new Transaction("A5598A47", LocalDate.now());
		
		user.setTransaction(Arrays.asList(t1, t2));
		t1.setUser(user);
		t2.setUser(user);
		
		userRepo.save(user);
	}
	
}
