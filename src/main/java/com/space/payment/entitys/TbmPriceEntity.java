package com.space.payment.entitys;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@Table(name = "tb_m_price")
public class TbmPriceEntity extends BaseEntity implements Serializable {

    public TbmPriceEntity() {
        // Create constructor
    }

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "price_id", nullable = false, unique = true, length = 150)
    private String priceId;

    @Column(name = "menu_id", nullable = false, length = 150)
    private String menuId;

    @Column(name = "price", length = 350)
    private float price;
}
