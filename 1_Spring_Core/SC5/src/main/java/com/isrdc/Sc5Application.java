package com.isrdc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Sc5Application {

	public static void main(String[] args) {
		Object o = SpringApplication.run(Sc5Application.class, args);
		System.out.println(o + "------");
	}

}
