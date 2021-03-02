package com.goverdovsky.bank.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "credit")
public class Credit {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    /**
     * Кредитный лимит
     */
    @Column(name = "limit")
    Long limit;

    /**
     * Процентная ставка
     */
    @Column(name = "interest_rate")
    Double interestRate;

}
