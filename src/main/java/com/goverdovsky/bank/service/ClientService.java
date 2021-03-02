package com.goverdovsky.bank.service;

import com.goverdovsky.bank.entity.Client;
import com.goverdovsky.bank.exception.IdFoundException;
import com.goverdovsky.bank.exception.IdNotFoundException;

import java.util.List;

public interface ClientService {

    Client add(Client client) throws IdFoundException;

    Client save(Client client) throws IdNotFoundException;

    void remove(Long id) throws IdNotFoundException;

    List<Client> getList();

    Client getById(Long id);

}
