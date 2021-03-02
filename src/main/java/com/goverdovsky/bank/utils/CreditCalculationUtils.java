package com.goverdovsky.bank.utils;

import com.goverdovsky.bank.model.MonthPayment;
import lombok.*;
import lombok.experimental.UtilityClass;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.pow;

@UtilityClass
public class CreditCalculationUtils {

    public List<MonthPayment> calculate(double credit, double percent, int monthCount) {
        List<MonthPayment> list = new ArrayList<>(monthCount);

        double monthPercent = (percent / 100 ) / 12;
        double pow = monthPercent * pow(1 + monthPercent, monthCount);
        double pow2 = pow(1 + monthPercent, monthCount) - 1;
        double paymentOnMonth = credit * (pow/pow2);
        double creditAmount = credit;

        for (int currentMonth = 1; currentMonth <= monthCount; ++currentMonth) {
            double amountPercentOnMonth = creditAmount * monthPercent;
            creditAmount = (creditAmount + amountPercentOnMonth) - paymentOnMonth;

            if (creditAmount < 0) {
                creditAmount = 0;
            }

            MonthPayment monthPayment = MonthPayment.builder()
                    .month(currentMonth)
                    .amount(creditAmount)
                    .payment(paymentOnMonth)
                    .debt(paymentOnMonth - amountPercentOnMonth)
                    .percent(amountPercentOnMonth)
                    .build();
            list.add(monthPayment);
        }
        return list;
    }

}
