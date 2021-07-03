package com.space.payment.models;

import lombok.Data;

import java.time.LocalDate;

@Data
public class ListMenuResponse extends ResponseStatus {
    public ResponseStatus responseStatus;
    public ResponseDetail responseDetail;

    @Data
    public class ResponseDetail
    {
        public String listMenuId;
        public LocalDate replyTimeStamp;
    }
}