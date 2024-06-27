package com.ak.dashboard.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("welcome")
public class WelcomeController {

    @GetMapping("health")
    public String health() {
        return "Spring-Boot Rest-Controller Successfully Up.";
    }

    @GetMapping
    public String welcome() {
        return "Welcome to Spring-boot demo project.";
    }
}
