package com.space.payment.controllers;

import com.space.payment.bizs.ListMenuBiz;
import com.space.payment.exceptions.BaseException;
import com.space.payment.models.ListMenuRequest;
import com.space.payment.models.ListMenuResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@RequestMapping("/api/v1")
public class ListMenuController {

    public ListMenuBiz listMenuBiz;

    @Autowired
    public ListMenuController(ListMenuBiz listMenuBiz) {
        this.listMenuBiz = listMenuBiz;
    }

    @PostMapping("/listmenu")
    public ResponseEntity<ListMenuResponse> createListMenu(@RequestBody ListMenuRequest listMenuRequest) throws BaseException {
        ListMenuResponse response = new ListMenuResponse();



        /*
        ListMenuRequest objListMenuRequest= new ListMenuRequest();
        objListMenuRequest.setListMenuId(listMenuRequest.getListMenuId());
        objListMenuRequest.setListMenuName(listMenuRequest.getListMenuName());
        objListMenuRequest.setCreateBy(listMenuRequest.getCreateBy());
        objListMenuRequest.setCreateDate(LocalDate.now());
        objListMenuRequest.setUpdateBy(listMenuRequest.getUpdateBy());
        objListMenuRequest.setUpdateDate(LocalDate.now());
        */

        return ResponseEntity.ok(response);
    }
}
