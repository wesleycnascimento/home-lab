package com.example.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String home(Model model) {
        // Set the message for the JSP
        model.addAttribute("message", "Hello, welcome to the Home App!");
        return "home"; // This maps to WEB-INF/jsp/home.jsp
    }
}