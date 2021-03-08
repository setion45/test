package com.goverdovsky.bank.controller;

import com.goverdovsky.bank.entity.Client;
import com.goverdovsky.bank.entity.Credit;
import com.goverdovsky.bank.entity.CreditOffer;
import com.goverdovsky.bank.exception.IdFoundException;
import com.goverdovsky.bank.exception.IdNotFoundException;
import com.goverdovsky.bank.repository.ClientRepository;
import com.goverdovsky.bank.repository.CreditRepository;
import com.goverdovsky.bank.service.CreditService;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@Controller
@RequestMapping("/credit")
public class CreditController {
    @Autowired
    CreditService creditService;

    @GetMapping(path = "/list")
    public String getCreditList(Model model) {
        model.addAttribute("credits", creditService.getList());
        return "/credit/credit.jsp";
    }

//    @GetMapping(path = "/add")
//    public String orderClient(@ModelAttribute("client") Client client) {
////        model.addAttribute("clients", clientService.getList());
//        return "/client/add.jsp";
//    }
//    @PostMapping(path = "/add")
//    public String addClient(Client client) {
//        try {
//            clientService.add(client);
//        } catch (IdFoundException e) {
//            e.printStackTrace();
//        }
//        return "redirect:/";
//    }



//    @Data
//    public static class ListContainer {
//        private List<Credit> list;
//
//    }
}
