package com.space.payment.models;

import lombok.Data;

import java.time.LocalDate;

@Data
public class MenuResponse extends ResponseStatus {
    public String menuId;
    public LocalDate replyTimeStamp;
}
