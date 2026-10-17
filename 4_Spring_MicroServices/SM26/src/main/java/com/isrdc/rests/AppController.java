package com.isrdc.rests;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.isrdc.exceptions.ExceptionInfo;

@RestController
public class AppController {

	@GetMapping("/pro")
	public String process() {
		
		System.out.println("Process method --- Start");
		
		String res = "Sucess";

			int y = 12 / 0;
		
		
		System.out.println("Process method --- End");
		
		return res;
	}
	
	@GetMapping("/info")
	public String information() {
		
		System.out.println("information method --- Start");
		
		String res = "Sucess";
		
			int y = 12 / 0;
		
		System.out.println("information method --- End");
		
		return res;
	}
	
	@GetMapping("/act")
	public String action() {
		
		System.out.println("action method --- Start");
		
		String res = "Sucess";
		
		String st = null ;
		st.length();
		
		System.out.println("action method --- End");
		
		return res;
	}
}
