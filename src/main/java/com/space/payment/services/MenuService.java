package com.space.payment.services;

import com.space.payment.entitys.TbmMenuEntity;
import com.space.payment.exceptions.BaseException;
import com.space.payment.models.MenuRequest;
import com.space.payment.repositorys.TbmMenuRepository;
import com.space.payment.utils.DateUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
@Slf4j
public class MenuService {
    private TbmMenuRepository repository;
    @Autowired
    public MenuService(TbmMenuRepository repository) {
        this.repository = repository;
    }

    public TbmMenuEntity createMenu(MenuRequest menuRequest) throws BaseException {
        TbmMenuEntity entity = new TbmMenuEntity();
        entity.setMenuId(menuRequest.getListMenuId());
        entity.setMenuName(menuRequest.getListMenuName());
        entity.setCreateBy(menuRequest.getCreateBy());
        entity.setCreateDate(DateUtil.asDate(LocalDate.now()));
        entity.setIsActive(menuRequest.getIsActive());
        entity.setUpdateBy(menuRequest.getUpdateBy());
        entity.setUpdateDate(DateUtil.asDate(LocalDate.now()));

        return repository.save(entity);
    }
}
