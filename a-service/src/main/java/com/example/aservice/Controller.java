package com.example.aservice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/a-service")
@Slf4j
public class Controller {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, This is A-service";
    }

    @GetMapping("/message")
    public String message(@RequestHeader("a-request") String requestHeader) {
        log.info("request requestHeader = {}", requestHeader);
        return String.format("RequestHeader = %s , ResponseHeader = %s", requestHeader);

    }
}
