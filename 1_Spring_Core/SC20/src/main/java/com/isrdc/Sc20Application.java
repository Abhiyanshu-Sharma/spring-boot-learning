package com.isrdc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.isrdc.beans.A1Bean;

@SpringBootApplication
public class Sc20Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Sc20Application.class, args);
		
//		ABean x = context.getBean(ABean.class);
		A1Bean x = context.getBean(A1Bean.class);
		
		x.info();
		
	}

}
