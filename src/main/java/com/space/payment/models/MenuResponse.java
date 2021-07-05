package com.space.payment.models;

import lombok.Data;

import java.time.LocalDate;

@Data
public class MenuResponse extends ResponseStatus {
    public ResponseStatus responseStatus;
    public ResponseDetail responseDetail;

    @Data
    public class ResponseDetail
    {
        public String menuId;
        public LocalDate replyTimeStamp;
    }
}
