package com.springdemo.springDemoArtifact;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringDemoArtifactApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringDemoArtifactApplication.class, args);
	}

	@GetMapping("/")
	public String helloIndex(@RequestParam(value = "name", defaultValue = "Index Page") String name) {
		return String.format("Hello %s!", name);
	}
	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s!", name);
	}
}