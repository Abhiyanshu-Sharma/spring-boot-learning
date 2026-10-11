package com.isrdc.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isrdc.dtos.UserDTO;
import com.isrdc.entities.User;
import com.isrdc.repos.UserRepo;

@Service
public class UserService {
	
	@Autowired
	private UserRepo userRepo;
	
	public UserDTO fetchUser(Integer userId) {
		UserDTO userDTO = new UserDTO();
		
		Optional<User> opt = userRepo.findById(userId);
		
		if(opt.isPresent()) {
			User user = opt.get();
			BeanUtils.copyProperties(user, userDTO);
		}
		
		return userDTO;
	}
	
	public ArrayList<UserDTO> fetchAllUsers() {
		ArrayList<UserDTO> users = new ArrayList<>();
		
		List<User> allUsers = userRepo.findAll();
		
		for(User user : allUsers) {
			UserDTO userDTO = new UserDTO();
			BeanUtils.copyProperties(user, userDTO);
			users.add(userDTO);
		}
		
		return users;
	}
	
	public void saveUser(UserDTO userDTO) {
		User user = new User();
		
		BeanUtils.copyProperties(userDTO, user);
		
		userRepo.save(user);
	}
}