package com.space.payment.repositorys;

import com.space.payment.entitys.TbmBankEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TbmBankRepository extends JpaRepository<TbmBankEntity, String> {

}
