package com.alexm.flowerstoreforever.payment;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RequestMapping(path = "api/payment")
@RestController
public class PaymentController {
    @GetMapping
    public List<Payment> strategies() {
        return List.of(new PayPalPaymentStrategy(), new CreditCardPaymentStrategy());
    }
}
