package com.example.sweater.controllers;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainControllers {

    @GetMapping("/")
    public String home( Model model) {
        model.addAttribute("title", "Банк");
        return "home";
    }

}
