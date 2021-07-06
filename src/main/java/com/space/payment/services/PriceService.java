package com.space.payment.services;

import com.space.payment.entitys.TbmMenuEntity;
import com.space.payment.entitys.TbmPriceEntity;
import com.space.payment.exceptions.BaseException;
import com.space.payment.models.MenuRequest;
import com.space.payment.models.PriceRequest;
import com.space.payment.repositorys.TbmPriceRepository;
import com.space.payment.utils.DateUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Service
@Slf4j
public class PriceService {
    private TbmPriceRepository repository;
    @Autowired
    public PriceService(TbmPriceRepository repository) {
        this.repository = repository;
    }

    public TbmPriceEntity createPrice(PriceRequest priceRequest) throws BaseException {
        TbmPriceEntity entity = new TbmPriceEntity();
        entity.setMenuId(priceRequest.getMenuId());
        entity.setPrice(priceRequest.getPrice());
        entity.setCreateBy(priceRequest.getCreateBy());
        entity.setCreateDate(DateUtil.asDate(LocalDateTime.now()));
        entity.setIsActive(priceRequest.getIsActive());
        entity.setUpdateBy(priceRequest.getUpdateBy());
        entity.setUpdateDate(DateUtil.asDate(LocalDateTime.now()));

        return repository.save(entity);
    }
}
