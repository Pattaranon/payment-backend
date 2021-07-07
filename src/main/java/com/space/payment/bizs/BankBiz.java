package com.space.payment.bizs;

import com.space.payment.exceptions.BaseException;
import com.space.payment.mappers.BankMapper;
import com.space.payment.models.BankRequest;
import com.space.payment.models.BankResponse;
import com.space.payment.models.MenuRequest;
import com.space.payment.models.MenuResponse;
import com.space.payment.services.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankBiz {

    private BankMapper bankMapper;
    private BankService bankService;

    @Autowired
    public BankBiz(BankMapper bankMapper, BankService bankService) {
        this.bankMapper = bankMapper;
        this.bankService = bankService;
    }

    public BankResponse createBanking(BankRequest bankRequest) throws BaseException {
        return bankMapper.toBankResponse(bankService.createBanking(bankRequest));
    }
}
