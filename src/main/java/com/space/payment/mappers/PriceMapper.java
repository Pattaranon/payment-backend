package com.space.payment.mappers;

import com.space.payment.entitys.TbmPriceEntity;
import com.space.payment.models.PriceResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PriceMapper {
    PriceResponse toPriceResponse(TbmPriceEntity tbmPriceEntityEntity);
}
