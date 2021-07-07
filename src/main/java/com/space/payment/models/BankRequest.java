package com.space.payment.models;

import lombok.Data;

@Data
public class BankRequest extends BaseModel {
    private String bankId;
    private String bankName;
    private String accountNo;
    private Boolean isActive;
    private String createBy;
    private String updateBy;
}
