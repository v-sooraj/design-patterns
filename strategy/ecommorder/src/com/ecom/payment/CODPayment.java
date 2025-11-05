package com.ecom.payment;

import com.ecom.strategy.PaymentStrategy;

public class CODPayment implements PaymentStrategy {

    @Override
    public void pay(int amount) {
        System.out.println("COD order successful pay $"+ amount +" at doorstep");
    }
}
