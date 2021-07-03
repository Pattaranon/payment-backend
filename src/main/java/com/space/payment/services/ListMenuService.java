package com.space.payment.services;

import com.space.payment.exceptions.BaseException;
import com.space.payment.models.ListMenuRequest;
import com.space.payment.models.ListMenuResponse;
import com.space.payment.repositorys.TbmListMenuRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ListMenuService {
    private final TbmListMenuRepository tbmListMenuRepository;

    @Autowired
    public ListMenuService(TbmListMenuRepository tbmListMenuRepository) {
        this.tbmListMenuRepository = tbmListMenuRepository;
    }

    public ListMenuResponse createListMenu(ListMenuRequest listMenuRequest) throws BaseException {
        ListMenuResponse response = new ListMenuResponse();

        return response;
    }
}
