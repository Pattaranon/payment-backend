package com.space.payment.mappers;

import com.space.payment.entitys.TbmListMenuEntity;
import com.space.payment.models.ListMenuResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ListMenuMapper {

    ListMenuResponse toListMenuResponse(TbmListMenuEntity listMenuEntity);
}
