package com.space.payment.models;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class BankResponse extends ResponseStatus {
    public String bankId;
    public LocalDateTime replyTimeStamp;
}
