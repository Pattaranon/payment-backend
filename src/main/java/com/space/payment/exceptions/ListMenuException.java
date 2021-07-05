package com.space.payment.exceptions;

public class ListMenuException extends BaseException {

    public ListMenuException(String code) {
        super("listMenu." + code);
    }

    // CREATE
    public static ListMenuException createListMenuIdDuplicated() {
        return new ListMenuException("create.listmenuId.duplicated");
    }
}
