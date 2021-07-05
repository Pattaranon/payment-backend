package com.space.payment.entitys;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@Table(name = "tb_m_price")
public class TbmPriceEntity extends BaseEntity implements Serializable {

    public TbmPriceEntity() {
    }

    @Id
    @Column(name = "price_id", nullable = false, unique = true, length = 150)
    private String priceId;

    @Column(name = "menu_id", nullable = false, unique = true, length = 150)
    private String menuId;

    @Column(name = "price", length = 350)
    private float price;
}
