package com.space.payment.models;

import lombok.Data;

@Data
public class MenuRequest extends BaseModel {
    private String menuName;
    private Boolean isActive;
    private String createBy;
    private String updateBy;
}
