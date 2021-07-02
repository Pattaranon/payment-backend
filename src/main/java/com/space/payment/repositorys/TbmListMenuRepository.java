package com.space.payment.repositorys;

import com.space.payment.entitys.TbmListMenuEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TbmListMenuRepository extends JpaRepository<TbmListMenuEntity, String> {
    public List<TbmListMenuEntity> findAllByIsActive(String isActive);
}
