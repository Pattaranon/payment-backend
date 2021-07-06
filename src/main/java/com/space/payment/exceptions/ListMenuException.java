package com.space.payment.exceptions;

public class ListMenuException extends BaseException {

    public ListMenuException(String code) {
        super("listMenu." + code);
    }

    // CREATE
    public static ListMenuException createListMenuNameDuplicated() {
        return new ListMenuException("create.menuName.duplicated");
    }
}
