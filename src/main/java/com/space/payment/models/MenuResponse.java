package com.space.payment.models;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class MenuResponse extends ResponseStatus {
    public String menuId;
    public LocalDateTime replyTimeStamp;
}
