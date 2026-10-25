package com.isrdc.rests;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class App2Controller {
	
	@GetMapping("/tran")
	public String transaction() {
		
		System.out.println("transaction method --- Start");
		
		String res = "Sucess";
		
		String st = null ;
		st.length();
		
		System.out.println("transaction method --- End");
		
		return res;
	}
}
