package com.goverdovsky.bank.controller;

import com.goverdovsky.bank.entity.Credit;
import com.goverdovsky.bank.service.CreditService;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Slf4j
@Controller
public class CreditController {
    @Autowired
    CreditService creditService;

    @GetMapping(path = "/credit")
    public String getCreditList(Model model) {
//        model.addAttribute("credits", creditService.getList());
        return "/credit/credit.jsp";
    }

    @Data
    public static class ListContainer {
        private List<Credit> list;

    }
}
