package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeServelet {

    @GetMapping("/")
    public String welcome() {
        return "Welcome to COMP367, Parth Sharma!";
    }
}