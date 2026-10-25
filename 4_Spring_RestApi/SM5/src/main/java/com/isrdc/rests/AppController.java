package com.isrdc.rests;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.isrdc.dtos.UserDTO;

import tools.jackson.databind.ObjectMapper;

@RestController
public class AppController {
	
	@GetMapping("/info")
	public String information() {
		
		String json = "{\"name\":\"Dilip\",\"age\":47,\"rank\":9.9}";
		
		ObjectMapper om = new ObjectMapper();
		
		UserDTO userDto = om.readValue(json, UserDTO.class);
		
		return userDto.toString();
	}
	
	@GetMapping("/pro")
	public String process() {
		
		UserDTO userDto = new UserDTO("Jagdeesh", 31, 7.4f);
		
//		Jackson is a inbuilt library
		ObjectMapper om = new ObjectMapper();
		
		String json = om.writeValueAsString(userDto);
		
		System.out.println(json);
		
		return json;
	}
}
