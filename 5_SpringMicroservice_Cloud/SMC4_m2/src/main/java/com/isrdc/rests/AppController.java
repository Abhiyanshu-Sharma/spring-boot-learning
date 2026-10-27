package com.isrdc.rests;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

	@GetMapping("/as2")
	public String AllServers2() {
		return "All Servers are connected and running";
	}
}
