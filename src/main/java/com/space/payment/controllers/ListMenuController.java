package com.space.payment.controllers;

import com.space.payment.exceptions.BaseException;
import com.space.payment.models.ListMenuModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@RequestMapping("/api/v1")
public class ListMenuController {

    @PostMapping("/listmenu")
    public ResponseEntity<ListMenuModel> createListMenu(@RequestBody ListMenuModel listMenuModel) throws BaseException {
        ListMenuModel objlistMenuModel = new ListMenuModel();
        objlistMenuModel.setListMenuId(listMenuModel.getListMenuId());
        objlistMenuModel.setListMenuName(listMenuModel.getListMenuName());
        objlistMenuModel.setCreateBy(listMenuModel.getCreateBy());
        objlistMenuModel.setCreateDate(LocalDate.now());
        objlistMenuModel.setUpdateBy(listMenuModel.getUpdateBy());
        objlistMenuModel.setUpdateDate(LocalDate.now());

        return ResponseEntity.ok(objlistMenuModel);
    }
}
