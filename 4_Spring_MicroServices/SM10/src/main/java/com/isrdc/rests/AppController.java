package com.isrdc.rests;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.isrdc.dtos.UserDTO;

@RestController
public class AppController {

	@GetMapping("/pro")
	public String process(@RequestBody UserDTO userDto) {
		
		System.out.println(userDto);
		
		return userDto.toString();
	}
	
	@PostMapping("/act")
	public String action(@RequestBody() UserDTO userDto) {
		
		System.out.println(userDto);
		
		return userDto.toString();
	}
}
