package com.space.payment.models;

import lombok.Data;

@Data
public class ResponseStatus {
    public ResponseStatus() {
    }

    public String responseStatusCode;
    public String responseCode;
    public String responseMessage;
}
