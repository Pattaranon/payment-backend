package com.space.payment.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class PaymentController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hi Pattaranon";
    }
}
