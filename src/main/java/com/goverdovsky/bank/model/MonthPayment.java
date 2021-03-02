package com.goverdovsky.bank.model;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@Builder
@ToString
public class MonthPayment {

    Integer month;

    Double amount;

    Double payment;

    Double debt;

    Double percent;

}