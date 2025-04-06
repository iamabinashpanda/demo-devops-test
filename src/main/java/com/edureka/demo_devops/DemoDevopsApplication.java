package com.edureka.demo_devops;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.GetExchange;

@SpringBootApplication
@RestController
public class DemoDevopsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoDevopsApplication.class, args);
	}

	@GetExchange("/")
	public String hello() {
		return String.format("<h1>Hello THere !! Welcome to Spring Boot.</h1>");
	}
}
