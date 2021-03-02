package com.goverdovsky.bank.service;

import com.goverdovsky.bank.entity.Client;
import com.goverdovsky.bank.entity.Credit;
import com.goverdovsky.bank.entity.CreditOffer;

import java.time.LocalDate;
import java.util.List;

public interface CreditService {

    List<Credit> getList();
    /**
     * Создает кредитное предложение клиенту на основе кредитного лимита
     */
    CreditOffer createOffer(Client client, Credit credit, LocalDate onDate, Integer months);

}
