package com.example.week04;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Week04Application {

    public static void main(String[] args) {
        SpringApplication.run(Week04Application.class, args);
    }

    @Bean
    public CommandLineRunner lineRunner() {
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
            }
        };
    }

}
