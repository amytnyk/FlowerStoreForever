package com.alexm.flowerstoreforever.payment;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PayPalPaymentStrategy implements Payment {
    @Override
    public boolean pay(double price) {
        // some PayPal processing
        return true;
    }

    @Override
    public String toString() {
        return "PayPalPaymentStrategy";
    }
}
