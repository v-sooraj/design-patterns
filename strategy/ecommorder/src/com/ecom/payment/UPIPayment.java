package com.ecom.payment;

import com.ecom.strategy.PaymentStrategy;

public class UPIPayment implements PaymentStrategy {

    @Override
    public void pay(int amount) {
        System.out.println("UPI payment of $"+ amount +" successful");
    }
}
