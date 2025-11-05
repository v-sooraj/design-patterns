package com.ecom.refund;

import com.ecom.strategy.RefundStrategy;

public class CreditCardRefund implements RefundStrategy {

    @Override
    public void refund(int amount) {
        System.out.println("Credit card refund of $"+ amount +" successful");
    }
}
