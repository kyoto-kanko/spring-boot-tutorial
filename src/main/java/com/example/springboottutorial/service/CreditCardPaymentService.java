package com.example.springboottutorial.service;

import org.springframework.stereotype.Service;

@Service
public class CreditCardPaymentService implements PaymentService {
    @Override
    public String pay(int amount) {
        return amount + " paid using Credit Card.";
    }
}
