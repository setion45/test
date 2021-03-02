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
    Long limit;

    /**
     * Процентная ставка
     */
    Double interestRate;

}
