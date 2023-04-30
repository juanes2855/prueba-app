package com.example.pruebaapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PruebaAppApplication {


    @GetMapping("/mensaje")
    public String mensaje(){
        return "Welcome from java";
    }


    public static void main(String[] args) {
        SpringApplication.run(PruebaAppApplication.class, args);
    }

}
