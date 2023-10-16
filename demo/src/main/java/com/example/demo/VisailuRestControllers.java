package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VisailuRestControllers {
    @GetMapping("/")
    public String Homepage(){
        return ("wellcome to Visailu!");
    
    }
}
