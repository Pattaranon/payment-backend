package com.space.payment.models;

import lombok.Data;

import java.time.LocalDate;

@Data
public class PriceResponse extends ResponseStatus {
    public String priceId;
    public LocalDate replyTimeStamp;
}
