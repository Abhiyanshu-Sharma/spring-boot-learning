package com.isrdc.rests;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

	@GetMapping("/pro")
	public String process(String nm, Integer ag) {
		System.out.println(nm);
		System.out.println(nm);
		
		return nm + " " + ag;
	}
	
	@GetMapping("/info")
	public String information(@RequestParam("nm") String name, @RequestParam("ag") Integer age) {
		System.out.println(name);
		System.out.println(age);
		
		return name + " " + age;
	}
}
