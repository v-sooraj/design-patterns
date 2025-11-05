package com.ecom.refund;

import com.ecom.strategy.RefundStrategy;

public class CODRefund implements RefundStrategy {

    @Override
    public void refund(int amount) throws UnsupportedOperationException{
        throw new UnsupportedOperationException("Cannot initiate refund for COD order");
    }
}
