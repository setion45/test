package com.goverdovsky.bank.service.impl;

import com.goverdovsky.bank.entity.Client;
import com.goverdovsky.bank.entity.Credit;
import com.goverdovsky.bank.entity.CreditOffer;
import com.goverdovsky.bank.entity.PaymentPlan;
import com.goverdovsky.bank.model.MonthPayment;
import com.goverdovsky.bank.repository.CreditOfferRepository;
import com.goverdovsky.bank.repository.PaymentPlanRepository;
import com.goverdovsky.bank.service.CreditService;
import com.goverdovsky.bank.utils.CreditCalculationUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CreditServiceImpl implements CreditService {

    @Autowired
    CreditOfferRepository creditOfferRepository;

    @Autowired
    PaymentPlanRepository paymentPlanRepository;

    @Override
    @Transactional
    public CreditOffer createOffer(Client client, Credit credit, LocalDate onDate, Integer months) {

        CreditOffer offer = new CreditOffer();
        offer.setClient(client);
        offer.setCredit(credit);
        offer.setAmount(credit.getLimit());

        offer = creditOfferRepository.save(offer);

        List<PaymentPlan> plan = createPLan(offer, onDate, credit.getLimit(), credit.getInterestRate(), months);
        paymentPlanRepository.saveAll(plan);

        return offer;
    }

    private List<PaymentPlan> createPLan(
            CreditOffer offer, LocalDate onDate,  double credit, double percent, int monthCount) {
        return CreditCalculationUtils.calculate(
                credit, percent, monthCount)
                .stream()
                .map(payment -> {
                    PaymentPlan plan = new PaymentPlan();
                    plan.setAmount(payment.getAmount());
                    plan.setDate(onDate.plus(payment.getMonth(), ChronoUnit.MONTHS));
                    plan.setDebt(payment.getDebt());
                    plan.setPercentage(payment.getPercent());
                    plan.setCreditOffer(offer);
                    return plan;
                }).collect(Collectors.toList());
    }

}
