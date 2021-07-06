package com.space.payment.services;

import com.space.payment.entitys.TbmMenuEntity;
import com.space.payment.exceptions.BaseException;
import com.space.payment.exceptions.MenuException;
import com.space.payment.models.MenuRequest;
import com.space.payment.repositorys.TbmMenuRepository;
import com.space.payment.utils.DateUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class MenuService {
    private TbmMenuRepository repository;
    @Autowired
    public MenuService(TbmMenuRepository repository) {
        this.repository = repository;
    }

    public List<TbmMenuEntity> findByMenuName(String menuName) {
        return repository.findByMenuName(menuName);
    }

    public TbmMenuEntity createMenu(MenuRequest menuRequest) throws BaseException {
        TbmMenuEntity entity = new TbmMenuEntity();
        entity.setMenuName(menuRequest.getMenuName());
        entity.setAccountNo(menuRequest.getAccountNo());
        entity.setBankName(menuRequest.getBankName());
        entity.setCreateBy(menuRequest.getCreateBy());
        entity.setCreateDate(DateUtil.asDate(LocalDateTime.now()));
        entity.setIsActive(menuRequest.getIsActive());
        entity.setUpdateBy(menuRequest.getUpdateBy());
        entity.setUpdateDate(DateUtil.asDate(LocalDateTime.now()));

        return repository.save(entity);
    }
}
