package com.isrdc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.isrdc.beans.ABean;
import com.isrdc.beans.BBean;
import com.isrdc.beans.CBean;

@SpringBootApplication
public class Sc18Application {

	public static void main(String[] args) {
		SpringApplication.run(Sc18Application.class, args);
	}
	
//	We move this to AppConfiguration in com.isrdc.confs
	
//	@Bean
//	public ABean createABean() {
//		System.out.println("-------createABean()--------");
//		return new ABean("Mohan");
//	}
//	
//	@Bean
//	public BBean createBBean() {
//		System.out.println("-------createBBean()--------");
//		return new BBean("Dinesh");
//	}
//	
//	@Bean
//	public CBean createCBean() {
//		System.out.println("-------createCBean()--------");
//		return new CBean("Mukund");
//	}

}
