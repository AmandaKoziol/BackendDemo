package com.springboot.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication(scanBasePackages = {"com.controller", "com.service", "com.student"})
@EntityScan(basePackages = {"com.student"})
public class SpringBootWorkshopApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWorkshopApplication.class, args);
	}

}
