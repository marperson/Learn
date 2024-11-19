package com.springswaggermaven.SpringWithSwaggerMaven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
//@EnableSwagger2
@EnableWebMvc
public class SpringWithSwaggerMavenApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringWithSwaggerMavenApplication.class, args);
	}

}
