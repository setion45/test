package com.example.sweater.controllers;

import com.example.sweater.models.Klient;
import com.example.sweater.repo.KlientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class KlientController {

    @Autowired
    private KlientRepository klientRepository;

 @GetMapping("/klient")
    public String klient(Model model) {
     Iterable<Klient> klients = klientRepository.findAll();
     model.addAttribute("klients",klients);
     return "klient";
 }
    @PostMapping("/klient")
    public String klientAdd(@RequestParam String FIO,@RequestParam String mail, @RequestParam int phone, @RequestParam int passport, Model model) {
     Klient klient = new Klient(FIO, mail, phone, passport);
     klientRepository.save(klient);
     return "redirect:/";
    }
}
