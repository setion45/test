package com.goverdovsky.bank.utils;

import com.goverdovsky.bank.model.MonthPayment;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.List;

@Slf4j
public class CreditCalculationUtilsTest {

    @Test
    public void calculate() {
        int monthCount = 36;
        double percent = 12;
        double amount = 20000;

        List<MonthPayment> calculate = CreditCalculationUtils.calculate(amount, percent, monthCount);

        calculate.forEach(payment -> {
            log.info(payment.toString());
        });

        final Double sum = calculate.stream()
                .map(MonthPayment::getPayment)
                .reduce(0D, Double::sum);

        log.info(sum.toString());

    }

}
