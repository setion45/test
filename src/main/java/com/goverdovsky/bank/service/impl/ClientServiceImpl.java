package com.goverdovsky.bank.service.impl;

import com.goverdovsky.bank.entity.Client;
import com.goverdovsky.bank.exception.ClientNotFoundException;
import com.goverdovsky.bank.exception.IdFoundException;
import com.goverdovsky.bank.exception.IdNotFoundException;
import com.goverdovsky.bank.repository.ClientRepository;
import com.goverdovsky.bank.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    ClientRepository clientRepository;

    @Override
    @Transactional
    public Client add(Client client) throws IdFoundException {
        if (client.getId() != null) {
            throw new IdFoundException("Cannot add new client cause Identifier is set");
        }
        return clientRepository.save(client);
    }

    @Override
    public Client save(Client client) throws IdNotFoundException {
        if (client.getId() == null) {
            throw new IdNotFoundException("Client id not found");
        }
        return clientRepository.save(client);
    }

    @Override
    public void remove(Long id) throws IdNotFoundException {
        if (id == null) {
            throw new IdNotFoundException("Client id not found");
        }
        clientRepository.deleteById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Client> getList() {
        return clientRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Client getById(Long id) {
        return clientRepository.findById(id)
                .orElseThrow(() -> new ClientNotFoundException());
    }

}
