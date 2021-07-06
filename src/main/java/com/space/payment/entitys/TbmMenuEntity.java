package com.space.payment.entitys;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@EqualsAndHashCode(callSuper = true)
@Data
@Table(name = "tb_m_menu")
public class TbmMenuEntity extends BaseEntity implements Serializable {

    public TbmMenuEntity() {
        // Create constructor
    }

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "menu_id", nullable = false, unique = true, length = 150)
    private String menuId;

    @Column(name = "menu_name", nullable = false, length = 250)
    private String menuName;
}
