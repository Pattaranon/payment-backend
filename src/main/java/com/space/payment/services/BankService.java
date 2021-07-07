package com.space.payment.services;

import com.space.payment.entitys.TbmBankEntity;
import com.space.payment.entitys.TbmMenuEntity;
import com.space.payment.exceptions.BaseException;
import com.space.payment.models.BankRequest;
import com.space.payment.models.MenuRequest;
import com.space.payment.repositorys.TbmBankRepository;
import com.space.payment.utils.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class BankService {

    private TbmBankRepository repository;

    @Autowired
    public BankService(TbmBankRepository repository) {
        this.repository = repository;
    }

    public TbmBankEntity createBanking(BankRequest bankRequest) throws BaseException {
        TbmBankEntity entity = new TbmBankEntity();
        entity.setBankName(bankRequest.getBankName());
        entity.setAccountNo(bankRequest.getAccountNo());
        entity.setCreateBy(bankRequest.getCreateBy());
        entity.setCreateDate(DateUtil.asDate(LocalDateTime.now()));
        entity.setIsActive(bankRequest.getIsActive());
        entity.setUpdateBy(bankRequest.getUpdateBy());
        entity.setUpdateDate(DateUtil.asDate(LocalDateTime.now()));

        return repository.save(entity);
    }
}
