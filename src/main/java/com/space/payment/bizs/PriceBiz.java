package com.space.payment.bizs;

import com.space.payment.entitys.TbmMenuEntity;
import com.space.payment.entitys.TbmPriceEntity;
import com.space.payment.exceptions.BaseException;
import com.space.payment.mappers.MenuMapper;
import com.space.payment.mappers.PriceMapper;
import com.space.payment.models.MenuRequest;
import com.space.payment.models.MenuResponse;
import com.space.payment.models.PriceRequest;
import com.space.payment.models.PriceResponse;
import com.space.payment.services.MenuService;
import com.space.payment.services.PriceService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class PriceBiz {
    private PriceMapper priceMapper;
    private PriceService priceService;

    @Autowired
    public PriceBiz(PriceMapper priceMapper, PriceService priceService) {
        this.priceMapper = priceMapper;
        this.priceService = priceService;
    }

    public PriceResponse createPrice(PriceRequest priceRequest) throws BaseException {
        TbmPriceEntity priceEntity = priceService.createPrice(priceRequest);
        return priceMapper.toPriceResponse(priceEntity);
    }
}
