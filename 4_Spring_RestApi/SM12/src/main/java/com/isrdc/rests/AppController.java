package com.isrdc.rests;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.isrdc.dtos.UserDTO;

@RestController
public class AppController {
	
	@PostMapping(value = "/info", consumes= {"application/xml", "application/json"}, produces="text/plain")
	public String information(@RequestBody UserDTO userDto) {
		return userDto.toString() + "\nSuccess";
	}
	
	@PostMapping(value = "/act", consumes="application/xml", produces="text/plain")
	public String action(@RequestBody UserDTO userDto) {
		return userDto.toString() + "\nSuccess";
	}
	
	@PostMapping(value = "/pro", consumes="application/json", produces="text/plain")
	public String process(@RequestBody UserDTO userDto) {
		return userDto.toString() + "\nSuccess";
	}
}
