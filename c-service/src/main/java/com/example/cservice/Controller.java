package com.example.cservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/c-service")
public class Controller {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, This is C-service";
    }
}
