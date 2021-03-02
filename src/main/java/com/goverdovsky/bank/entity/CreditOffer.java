package com.goverdovsky.bank.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "credit_offer")
public class CreditOffer {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    /**
     * Клиент
     */
    @ManyToOne
    @JoinColumn(name = "client_id")
    Client client;

    /**
     * Кредит
     */
    @OneToOne
    @JoinColumn(name = "credit_id")
    Credit credit;

    /**
     * Сумма кредита
     */
    @Column(name = "amount")
    Long amount;

    /**
     * График платежей
     */
    @OneToMany(mappedBy = "creditOffer", fetch = FetchType.LAZY)
    List<PaymentPlan> paymentPlan;

}
