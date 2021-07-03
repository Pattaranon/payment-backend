package com.space.payment.models;

import lombok.Data;

@Data
public class ListMenuRequest extends BaseModel {

    private String listMenuId;
    private String listMenuName;

}
