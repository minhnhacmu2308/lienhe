package com.example.lienhespring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.example.lienhespring.*")
@SpringBootApplication
public class
LienheSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(LienheSpringApplication.class, args);
    }

}
