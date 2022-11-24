package com.example.demoapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
@RequestMapping("/api")
public class DemoAppApplication {



    public static void main(String[] args) {
        SpringApplication.run(DemoAppApplication.class, args);
    }

// comment addes
    @GetMapping
    public String getData(){
        return "the thing has worked so no need to worry";
    }

    @PostMapping
    public void done(@RequestBody String s){

    }

    @PostMapping("/demo")
    public void done2(@RequestBody String s){

    }
}
