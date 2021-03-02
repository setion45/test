package com.goverdovsky.bank.controller;

import com.goverdovsky.bank.entity.Client;
import com.goverdovsky.bank.exception.IdNotFoundException;
import com.goverdovsky.bank.service.ClientService;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@Controller
@RequestMapping("/client")
public class ClientController {

    @Autowired
    ClientService clientService;

    @GetMapping(path = "/list")
    public String getClientList(Model model) {
        model.addAttribute("clients", clientService.getList());
        return "/client/list.jsp";
    }

    @GetMapping(path = "/info/{id}")
    public String getClientList(@PathVariable("id") Long id, Model model) {
        Client client = clientService.getById(id);
        model.addAttribute("client", client);
        return "/client/info.jsp";
    }

    @PostMapping(path = "/edit")
    public String saveClient(@ModelAttribute("client") Client client) {
        try {
            clientService.save(client);
        } catch (IdNotFoundException e) {
            throw new RuntimeException(e);
        }
        return "redirect:/client/info/" + client.getId();
    }

    @Data
    public static class ListContainer {
        private List<Client> list;

    }
}
