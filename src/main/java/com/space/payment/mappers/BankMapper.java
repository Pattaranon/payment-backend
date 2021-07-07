package com.space.payment.mappers;

import com.space.payment.entitys.TbmBankEntity;
import com.space.payment.models.BankResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BankMapper {
    BankResponse toBankResponse(TbmBankEntity tbmBankEntity);
}
