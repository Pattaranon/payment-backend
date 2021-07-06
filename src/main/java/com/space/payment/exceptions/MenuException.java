package com.space.payment.exceptions;

public class MenuException extends BaseException {

    public MenuException(String code) {
        super("listMenu." + code);
    }

    // CREATE
    public static MenuException createListMenuIdDuplicated() {
        return new MenuException("create.menuId.duplicated");
    }

    public static MenuException createListMenuNameDuplicated() {
        return new MenuException("create.menuName.duplicated");
    }
}
