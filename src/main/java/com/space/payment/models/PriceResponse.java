package com.space.payment.models;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class PriceResponse extends ResponseStatus {
    public String priceId;
    public LocalDateTime replyTimeStamp;
}
