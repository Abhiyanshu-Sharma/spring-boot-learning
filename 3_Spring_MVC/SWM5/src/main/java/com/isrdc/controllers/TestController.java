package com.isrdc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TestController {
	@GetMapping("/abc")
	public String action() {
		return "info";
	}
}

//Caused by: java.lang.IllegalStateException: Ambiguous mapping. Cannot map 'testContrroller' method 
//com.isrdc.controllers.TestContrroller#action()
//to {GET [/abc]}: There is already 'test2Controller' bean method
//com.isrdc.controllers.Test2Controller#process() mapped.