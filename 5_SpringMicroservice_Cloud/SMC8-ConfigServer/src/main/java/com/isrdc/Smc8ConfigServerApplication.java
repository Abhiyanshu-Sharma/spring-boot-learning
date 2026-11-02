package com.isrdc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class Smc8ConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Smc8ConfigServerApplication.class, args);
	}

}
