package com.space.payment.controllers;

import com.space.payment.bizs.BankBiz;
import com.space.payment.exceptions.BaseException;
import com.space.payment.models.BankRequest;
import com.space.payment.models.BankResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/api/v1")
public class BankController {

    private BankBiz bankBiz;

    @Autowired
    public BankController(BankBiz bankBiz) {
        this.bankBiz = bankBiz;
    }

    @PostMapping("/banking")
    public ResponseEntity<BankResponse> createBanking(@RequestBody BankRequest bankRequest) throws BaseException {
        BankResponse response = bankBiz.createBanking(bankRequest);

        if(response.getBankId() != null) {
            response.setResponseStatusCode("SUCCESS");
            response.setResponseCode("PAYMENT-SUCCESS-CREATE-BANK");
            response.setResponseMessage("Successfully.");
        }
        else {
            response.setResponseStatusCode("FAIL");
            response.setResponseCode("PAYMENT-FAIL-CREATE-BANK:001");
            response.setResponseMessage("Fail create bank");
        }

        response.setReplyTimeStamp(LocalDateTime.now());
        return ResponseEntity.ok(response);
    }
}
