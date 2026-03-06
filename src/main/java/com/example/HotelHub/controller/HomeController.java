package com.example.HotelHub.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller public class HomeController {
    @GetMapping("/register")
    public String hello(Model model) {
        return "register/register";
    }

    @GetMapping("/customer_mode")
    public String customer_mode(Model model) {
        return "customer_mode/customer_mode";
    }

    @GetMapping("/login")
    public String login(Model model) {
        return "login/login";
    }
}
