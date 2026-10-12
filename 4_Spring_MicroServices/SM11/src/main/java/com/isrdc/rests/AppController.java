package com.isrdc.rests;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.isrdc.dtos.UserDTO;

@RestController
public class AppController {
	
	@GetMapping(value = "/info", produces = {"application/xml", "application/json"})
	public UserDTO information() {
		UserDTO userDto = new UserDTO("Pradeep", 21, "8978675645");
		
		return userDto;
	}
	
	@GetMapping(value = "/act", produces = "application/xml")
	public UserDTO action() {
		UserDTO userDto = new UserDTO("Pradeep", 21, "8978675645");
		
		return userDto;
	}
	
	@GetMapping(value = "/pro", produces = "application/json")
	public UserDTO process() {
		UserDTO userDto = new UserDTO("Pradeep", 21, "8978675645");
		
		return userDto;
	}
}
