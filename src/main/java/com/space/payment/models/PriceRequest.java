package com.space.payment.models;

import lombok.Data;

@Data
public class PriceRequest extends BaseModel {
    private String priceId;
    private String menuId;
    private float price;
}
