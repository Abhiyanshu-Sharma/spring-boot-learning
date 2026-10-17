package com.isrdc.rests;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

	@GetMapping("/pro")
	public String process() {
		
		System.out.println("Process method --- Start");
		
		String res = "Sucess";
		
		try {
			int y = 12 / 0;
		}catch(ArithmeticException err) {
			res = "Divide by Zero Problem --- process";
			err.printStackTrace();
		}
		
		System.out.println("Process method --- End");
		
		return res;
	}
	
	@GetMapping("/info")
	public String information() {
		
		System.out.println("information method --- Start");
		
		String res = "Sucess";
		
		try {
			int y = 12 / 0;
		}catch(ArithmeticException err) {
			res = "Divide by Zero Problem --- information";
			err.printStackTrace();
		}
		
		System.out.println("information method --- End");
		
		return res;
	}
}
