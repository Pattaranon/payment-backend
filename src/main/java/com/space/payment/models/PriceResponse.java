package com.space.payment.models;

import lombok.Data;

import java.time.LocalDate;

@Data
public class PriceResponse extends ResponseStatus {
    public ResponseStatus responseStatus;
    public MenuResponse.ResponseDetail responseDetail;

    @Data
    public class ResponseDetail
    {
        public String priceId;
        public LocalDate replyTimeStamp;
    }
}
