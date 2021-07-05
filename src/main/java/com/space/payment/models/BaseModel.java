package com.space.payment.models;

import lombok.Data;

import java.time.LocalDate;

@Data
public class BaseModel {
    private Boolean isActive;
    private LocalDate createDate;
    private String createBy;
    private LocalDate updateDate;
    private String updateBy;
}
