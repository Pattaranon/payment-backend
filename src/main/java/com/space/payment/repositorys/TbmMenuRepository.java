package com.space.payment.repositorys;

import com.space.payment.entitys.TbmMenuEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TbmMenuRepository extends JpaRepository<TbmMenuEntity, String> {
    public List<TbmMenuEntity> findAllByIsActive(String isActive);
}
