package com.isrdc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@SpringBootApplication
@EnableAdminServer
public class Smc2AdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(Smc2AdminApplication.class, args);
	}

}
