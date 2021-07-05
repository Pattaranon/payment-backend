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
        return ResponseEntity.ok(response);
    }
}
