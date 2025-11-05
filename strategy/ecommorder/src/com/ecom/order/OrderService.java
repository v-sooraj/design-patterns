package com.ecom.order;

import com.ecom.strategy.PaymentStrategy;
import com.ecom.strategy.RefundStrategy;

public class OrderService {

    private PaymentStrategy paymentStrategy;
    private RefundStrategy refundStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void setRefundStrategy(RefundStrategy refundStrategy) {
        this.refundStrategy = refundStrategy;
    }

    public void order(int amount) throws UnsupportedOperationException {
        if (paymentStrategy != null) {
            paymentStrategy.pay(amount);
        } else {
            throw new UnsupportedOperationException("No payment strategy selected");
        }
    }

    public void initiateRefund(int amount) throws UnsupportedOperationException {
        if (refundStrategy != null) {
            refundStrategy.refund(amount);
        } else {
            throw new UnsupportedOperationException("No refund strategy selected");
        }
    }
}
