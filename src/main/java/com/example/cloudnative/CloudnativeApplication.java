package com.example.cloudnative;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@RestController
@SpringBootApplication
public class CloudnativeApplication {

	@RequestMappping("/")
	String home() {
		return "Hello world!!";
	}

	public static void main(String[] args) {
		SpringApplication.run(CloudnativeApplication.class, args);


}
