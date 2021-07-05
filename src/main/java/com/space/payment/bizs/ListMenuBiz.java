package com.space.payment.bizs;

import com.space.payment.entitys.TbmListMenuEntity;
import com.space.payment.exceptions.BaseException;
import com.space.payment.mappers.ListMenuMapper;
import com.space.payment.models.ListMenuRequest;
import com.space.payment.models.ListMenuResponse;
import com.space.payment.repositorys.TbmListMenuRepository;
import com.space.payment.services.ListMenuService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ListMenuBiz {
    public ListMenuMapper listMenuMapper;
    public ListMenuService listMenuService;
    @Autowired
    public ListMenuBiz(ListMenuMapper listMenuMapper, ListMenuService listMenuService) {
        this.listMenuMapper = listMenuMapper;
        this.listMenuService = listMenuService;
    }

    public ListMenuResponse createListMenu(ListMenuRequest listMenuRequest) throws BaseException {
        TbmListMenuEntity listMenuEntity = listMenuService.createListMenu(listMenuRequest);
        return listMenuMapper.toListMenuResponse(listMenuEntity);
    }
}
