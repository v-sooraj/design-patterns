package com.ecom.refund;

import com.ecom.strategy.RefundStrategy;

public class UPIRefund  implements RefundStrategy {

    @Override
    public void refund(int amount) {
        System.out.println("UPI refund of $"+ amount +" successful");
    }
}
