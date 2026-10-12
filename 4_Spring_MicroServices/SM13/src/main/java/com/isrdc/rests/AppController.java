package com.isrdc.rests;



import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
	
	@GetMapping("/pro")
	public ResponseEntity<String> process() {
		
		HttpHeaders headers = new HttpHeaders();
		
		headers.add("college", "GGITS");
		headers.add("city", "JBP");
		
		return new ResponseEntity<>("Process Executed Successfully", headers , HttpStatus.ACCEPTED);
	}
}
