package com.space.payment.services;

import com.space.payment.entitys.TbmListMenuEntity;
import com.space.payment.exceptions.BaseException;
import com.space.payment.models.ListMenuRequest;
import com.space.payment.models.ListMenuResponse;
import com.space.payment.repositorys.TbmListMenuRepository;
import com.space.payment.utils.DateUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
@Slf4j
public class ListMenuService {

    private TbmListMenuRepository repository;
    @Autowired
    public ListMenuService(TbmListMenuRepository repository) {
        this.repository = repository;
    }

    public TbmListMenuEntity createListMenu(ListMenuRequest listMenuRequest) throws BaseException {
        TbmListMenuEntity entity = new TbmListMenuEntity();
        entity.setListMenuId(listMenuRequest.getListMenuId());
        entity.setListMenuName(listMenuRequest.getListMenuName());
        entity.setCreateBy(listMenuRequest.getCreateBy());
        entity.setCreateDate(DateUtil.asDate(LocalDate.now()));
        entity.setIsActive(listMenuRequest.getIsActive());
        entity.setUpdateBy(listMenuRequest.getUpdateBy());
        entity.setUpdateDate(DateUtil.asDate(LocalDate.now()));

        return repository.save(entity);
    }
}
