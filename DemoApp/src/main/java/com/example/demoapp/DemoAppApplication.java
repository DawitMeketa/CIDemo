package com.example.demoapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/api")
public class DemoAppApplication {



    public static void main(String[] args) {
        SpringApplication.run(DemoAppApplication.class, args);
    }


    @GetMapping
    public String getData(){
        return "the thing has worked so no need to worry";
    }
}
