package com.ecom.test;

import com.ecom.order.OrderService;
import com.ecom.payment.CODPayment;
import com.ecom.payment.CreditCardPayment;
import com.ecom.payment.UPIPayment;
import com.ecom.refund.CODRefund;
import com.ecom.refund.CreditCardRefund;
import com.ecom.refund.UPIRefund;

public class EComCheckoutTest {

    public static void main(String[] args) {

        OrderService creditCardOrder = new OrderService();
        creditCardOrder.setPaymentStrategy(new CreditCardPayment());
        try {
            creditCardOrder.order(1000);
            creditCardOrder.initiateRefund(1000);
        } catch (UnsupportedOperationException ue) {
            System.out.println(ue.getMessage());
        }
        try {
            creditCardOrder.setRefundStrategy(new CreditCardRefund());
            creditCardOrder.initiateRefund(1000);
        } catch (UnsupportedOperationException ue) {
            System.out.println(ue.getMessage());
        }

        OrderService upiOrder = new OrderService();
        upiOrder.setPaymentStrategy(new UPIPayment());
        upiOrder.setRefundStrategy(new UPIRefund());
        try {
            upiOrder.order(100);
            upiOrder.initiateRefund(100);
        } catch (UnsupportedOperationException ue) {
            System.out.println(ue.getMessage());
        }

        OrderService codOrder = new OrderService();
        codOrder.setPaymentStrategy(new CODPayment());
        codOrder.setRefundStrategy(new CODRefund());
        try {
            codOrder.order(5000);
            codOrder.initiateRefund(5000);
        } catch (UnsupportedOperationException ue) {
            System.out.println(ue.getMessage());
        }

    }
}
