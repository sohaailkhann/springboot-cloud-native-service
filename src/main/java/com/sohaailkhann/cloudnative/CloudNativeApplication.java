package com.sohaailkhann.cloudnative;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CloudNativeApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudNativeApplication.class, args);
    }

    @GetMapping("/")
    public String home() {
        return "Spring Boot Cloud Native Service is running!";
    }

    @GetMapping("/health")
    public String health() {
        return "UP";
    }

    @GetMapping("/home")
    public String homePage() {
        return "Welcome to the Home Page of the Spring Boot Cloud Native Service";
    }
}