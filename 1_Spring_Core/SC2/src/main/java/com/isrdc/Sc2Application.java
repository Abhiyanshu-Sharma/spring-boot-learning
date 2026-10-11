package com.isrdc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Sc2Application {

	public static void main(String[] args) {
		Object o = SpringApplication.run(Sc2Application.class, args);
		
		
		System.out.println("Hello World...! - Good Morning");
		System.out.println(o + "------");
	}

}
