package com.isrdc.rests;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.isrdc.dtos.UserDTO;

@RestController
public class AppController {
	
	@GetMapping("/pro")
	public UserDTO process() {
		
		UserDTO userDto = new UserDTO("Rachit Kumar", 27, 7.1f);
		
		return userDto;
	}
	
	@GetMapping("/info")
	public List<UserDTO> information() {
		UserDTO userDto1 = new UserDTO("Rachit Kumar", 27, 7.1f);
		UserDTO userDto2 = new UserDTO("Mohit Kumar", 32, 9.2f);
		UserDTO userDto3 = new UserDTO("Jagtap Kumar", 18, 8.3f);
		
		ArrayList<UserDTO> userDtos = new ArrayList<>();
		
		userDtos.add(userDto1);
		userDtos.add(userDto2);
		userDtos.add(userDto3);
		
		return userDtos;
		
	}
	
	@GetMapping("/act")
	public ResponseEntity<UserDTO> action() {
		UserDTO userDto = new UserDTO("Naman Kumar", 21, 6.2f);
		
//		return ResponseEntity.ok(userDto);
		return new ResponseEntity<UserDTO>(userDto, HttpStatus.ACCEPTED);
	}
}
