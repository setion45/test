package com.goverdovsky.bank.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "payment_plan")
public class PaymentPlan {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    /**
     * Дата платежа
     */
    @Column(name = "date")
    LocalDate date;

    /**
     * Сумма платежа
     */
    @Column(name = "amount")
    Double amount;

    /**
     * Сумма гашения тела кредита
     */
    @Column(name = "debt")
    Double debt;

    /**
     * Сумма гашения процентов
     */
    @Column(name = "percentage")
    Double percentage;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "credit_offer_id", referencedColumnName = "id", insertable = false, updatable = false)
    CreditOffer creditOffer;

}
