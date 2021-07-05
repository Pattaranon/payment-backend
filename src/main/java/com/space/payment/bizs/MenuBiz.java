package com.space.payment.bizs;

import com.space.payment.entitys.TbmMenuEntity;
import com.space.payment.exceptions.BaseException;
import com.space.payment.mappers.MenuMapper;
import com.space.payment.models.MenuRequest;
import com.space.payment.models.MenuResponse;
import com.space.payment.services.MenuService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class MenuBiz {
    public MenuMapper menuMapper;
    public MenuService menuService;
    @Autowired
    public MenuBiz(MenuMapper menuMapper, MenuService menuService) {
        this.menuMapper = menuMapper;
        this.menuService = menuService;
    }

    public MenuResponse createMenu(MenuRequest menuRequest) throws BaseException {
        TbmMenuEntity menuEntity = menuService.createMenu(menuRequest);
        return menuMapper.toMenuResponse(menuEntity);
    }
}
