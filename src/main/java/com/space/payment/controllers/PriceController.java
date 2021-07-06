package com.space.payment.controllers;

import com.space.payment.bizs.MenuBiz;
import com.space.payment.bizs.PriceBiz;
import com.space.payment.exceptions.BaseException;
import com.space.payment.models.MenuResponse;
import com.space.payment.models.PriceRequest;
import com.space.payment.models.PriceResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;

@RestController
@RequestMapping("/api/v1")
public class PriceController {

    public PriceBiz priceBiz;

    @Autowired
    public PriceController(PriceBiz priceBiz) {
        this.priceBiz = priceBiz;
    }

    @PostMapping("/price")
    public ResponseEntity<PriceResponse> createPrice(@RequestBody PriceRequest priceRequest) throws BaseException {
        PriceResponse response = priceBiz.createPrice(priceRequest);
        if(response.getPriceId() != null) {
            response.setResponseStatusCode("SUCCESS");
            response.setResponseCode("PAYMENT-SUCCESS-CREATE-PRICE");
            response.setResponseMessage("Successfully.");
        }
        else {
            response.setResponseStatusCode("FAIL");
            response.setResponseCode("PAYMENT-FAIL-CREATE-PRICE:001");
            response.setResponseMessage("Fail create price");
        }

        response.setReplyTimeStamp(LocalDateTime.now());
        return ResponseEntity.ok(response);
    }
}
