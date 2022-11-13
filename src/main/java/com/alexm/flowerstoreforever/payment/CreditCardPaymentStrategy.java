package com.alexm.flowerstoreforever.payment;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CreditCardPaymentStrategy implements Payment {
    @Override
    public boolean pay(double price) {
        // Some CreditCard processing
        return true;
    }

    @Override
    public String toString() {
        return "CreditCardPaymentStrategy";
    }
}
