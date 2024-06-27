package com.ak.dashboard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GreetingsController {

    @GetMapping("/greet")
    public ModelAndView greet() {
        return new ModelAndView("greet");
    }
}
