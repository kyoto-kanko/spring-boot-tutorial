package com.example.springboottutorial.controller;

import com.example.springboottutorial.service.PaymentService;
import com.example.springboottutorial.dto.OrderRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    private final PaymentService paymentService;

    public OrderController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("/pay")
    public ResponseEntity<String> placeOrder(@RequestBody OrderRequest orderRequest) {
        final String paymentResponse = paymentService.pay(orderRequest.getAmount());
        return ResponseEntity.ok(paymentResponse);
    }
}
