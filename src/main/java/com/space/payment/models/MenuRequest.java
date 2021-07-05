package com.space.payment.models;

import lombok.Data;

@Data
public class MenuRequest extends BaseModel {
    private String listMenuId;
    private String listMenuName;
}
