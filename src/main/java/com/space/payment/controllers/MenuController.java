package com.space.payment.controllers;

import com.space.payment.bizs.MenuBiz;
import com.space.payment.exceptions.BaseException;
import com.space.payment.models.MenuRequest;
import com.space.payment.models.MenuResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class MenuController {

    public MenuBiz menuBiz;

    @Autowired
    public MenuController(MenuBiz menuBiz) {
        this.menuBiz = menuBiz;
    }

    @PostMapping("/menu")
    public ResponseEntity<MenuResponse> createMenu(@RequestBody MenuRequest menuRequest) throws BaseException {
        MenuResponse response = menuBiz.createMenu(menuRequest);

        if(response.getMenuId() != null) {
            response.setResponseStatusCode("SUCCESS");
            response.setResponseCode("PAYMENT-SUCCESS-CREATE-MENU");
            response.setResponseMessage("Successfully.");
        }
        else {
            response.setResponseStatusCode("FAIL");
            response.setResponseCode("PAYMENT-FAIL-CREATE-MENU:001");
            response.setResponseMessage("Fail create menu");
        }

        response.setReplyTimeStamp(LocalDate.now());
        return ResponseEntity.ok(response);
    }
}
