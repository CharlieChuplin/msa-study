package com.example.bservice;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
@RequiredArgsConstructor
@RestController
@RequestMapping("/b-service")
@Slf4j
public class Controller {

    private final Environment env;

    @GetMapping("/hello")
    public String hello(HttpServletRequest request) {
        log.info("Server port={}", request.getServerPort());
        return String.format("Hello, This is B-service on Port %s",env.getProperty("local.server.port"));
    }
}
