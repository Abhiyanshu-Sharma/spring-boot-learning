package com.isrdc.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.isrdc.dtos.UserDTO;
import com.isrdc.services.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userServ;
	
	@PostMapping("/update")
	public String updateUser(@ModelAttribute("user_dto") UserDTO userDTO, Model model) {
		
		System.out.println(userDTO + " ----");
		
		userServ.saveUser(userDTO);
		
//		model.addAttribute("user_dto", new UserDTO());
		model.addAttribute("msg", "Your profile is updated...");
		
		return "edit_user_profile.html";
	}
	
	@GetMapping("/edit_user/{uid}")
	public String showProfilePage(@PathVariable("uid") Integer userId, Model model) {
		
		UserDTO userDTO = userServ.fetchUser(userId);
		
		model.addAttribute("user_dto", userDTO);
		
		return "edit_user_profile.html";
	}
	
	@GetMapping("/show_all")
	public String showAllUsers(Model model) {
		
		ArrayList<UserDTO> users = userServ.fetchAllUsers();
		
		model.addAttribute("users", users);
		
		return "show_all_users.html";
	}
	
	@GetMapping("/home")
	public String toHomePage() {
		return "index";
	}
	
	@PostMapping("/signup")
	public String saveUser(UserDTO userDTO, Model model) {
		
		System.out.println(userDTO + " ----");
		
		userServ.saveUser(userDTO);
		
		model.addAttribute("user_dto", new UserDTO());
		model.addAttribute("msg", "User account is created...");
		
		return "signup.html";
	}
	
	@GetMapping("/signup")
	public String sendSignupPage(Model model) {
			
		model.addAttribute("user_dto", new UserDTO());
		
		return "signup.html";
	}
}