package com.goverdovsky.bank.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CreditController {

    @GetMapping(path = "/credit")
    public String getClientList(Model model) {

        return "/credit/credit.jsp";
    }
}
