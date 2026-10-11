package com.isrdc.rests;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

	@GetMapping("/pro/{page}")
	public String process(@PathVariable Integer page) {
		
		System.out.println(page);
		
		return "Page: " + page;
	}
	
	@GetMapping("/act/{pageNo}")
	public String action(@PathVariable Integer pageNo) {
		
		System.out.println(pageNo);
		
		return "PageNo: " + pageNo;
	}
	
	@GetMapping("/act/{page}/{line}")
	public String information(@PathVariable("page") Integer pageNo,@PathVariable("line") Integer lineNo) {
		
		System.out.println(pageNo + " " + lineNo);
		
		return "PageNo: " + pageNo + "\nLineNo: " + lineNo;
	}
}
