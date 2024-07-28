package com.springdemoswagger.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/helloworld")
    public String index() {
        return "Greetings from Spring Boot! - Hello World!";
    }

}