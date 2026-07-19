package com.cicd.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello() {
        return "Hello from CI/CD Pipeline SpringBoot Project - Part 1";
    }
}