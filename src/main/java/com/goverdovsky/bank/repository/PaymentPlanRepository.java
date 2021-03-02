package com.goverdovsky.bank.repository;

import com.goverdovsky.bank.entity.CreditOffer;
import com.goverdovsky.bank.entity.PaymentPlan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PaymentPlanRepository extends CrudRepository<PaymentPlan, Long> {

}
