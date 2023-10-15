package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class visailuRestController {
    @GetMapping("/")
    public String homepage(){
        return "wellcome";
    }
}
