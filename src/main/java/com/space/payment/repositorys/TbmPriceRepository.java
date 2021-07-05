package com.space.payment.repositorys;

import com.space.payment.entitys.TbmMenuEntity;
import com.space.payment.entitys.TbmPriceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TbmPriceRepository extends JpaRepository<TbmPriceEntity, String> {
    public List<TbmPriceEntity> findAllByIsActive(String isActive);
}
