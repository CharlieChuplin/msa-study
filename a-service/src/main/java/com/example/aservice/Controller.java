package com.example.aservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/a-service")
public class Controller {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, This is A-service";
    }
}
