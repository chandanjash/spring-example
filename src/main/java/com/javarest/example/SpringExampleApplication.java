package com.javarest.example;

import java.security.PublicKey;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringExampleApplication {
	
	@GetMapping("/")
	public String welcome()
	{
		return "Welcome to Java";
	}
	
	@GetMapping("/{input}")
	public String concats(@PathVariable String input)
	{
		return "Hi"+input+"Your application deployed successfully";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringExampleApplication.class, args);
	}

}
