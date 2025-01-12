package com.qusao.FirstApp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
@SpringBootApplication
public class FirstAppApplication {

    @RequestMapping("/")
    String home() {
        int num = 0; 
        return "Hello World!";
    }

    public static void main(String[] args) {
        SpringApplication.run(FirstAppApplication.class, args);
    }
}
