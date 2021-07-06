package com.space.payment.models;

import lombok.Data;

@Data
public class MenuRequest extends BaseModel {
    private String menuId;
    private String menuName;
    private String accountNo;
    private String bankName;
    private Boolean isActive;
    private String createBy;
    private String updateBy;
}
