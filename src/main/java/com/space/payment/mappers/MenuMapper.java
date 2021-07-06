package com.space.payment.mappers;

import com.space.payment.entitys.TbmMenuEntity;
import com.space.payment.models.MenuResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MenuMapper {
    MenuResponse toMenuResponse(TbmMenuEntity listMenuEntity);
}
