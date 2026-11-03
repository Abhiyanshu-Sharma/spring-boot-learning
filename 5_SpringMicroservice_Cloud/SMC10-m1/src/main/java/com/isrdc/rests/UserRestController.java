package com.isrdc.rests;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.isrdc.entities.User;
import com.isrdc.services.UserService;

import jakarta.annotation.PostConstruct;

@RestController
public class UserRestController {
	
	@Autowired
	private UserService userService;

	@PostMapping("/save_user")
	public String saveUser(@RequestBody User user) {
		
		userService.saveUser(user);
		
		return "New User Saved";
	}
	
	@GetMapping("/users")
	public Iterable<User> fetchAllUsers() {
		return userService.fetchUsers();
	}
}
