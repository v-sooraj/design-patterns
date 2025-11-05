package com.ecom.payment;

import com.ecom.strategy.PaymentStrategy;

public class CreditCardPayment implements PaymentStrategy {

    @Override
    public void pay(int amount) {
        System.out.println("Credit card payment of $"+ amount +" successful");
    }
}
