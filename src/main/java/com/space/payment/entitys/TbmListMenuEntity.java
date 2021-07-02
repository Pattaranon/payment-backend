package com.space.payment.entitys;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@EqualsAndHashCode(callSuper = true)
@Data
@Table(name = "tb_m_list_menu")
public class TbmListMenuEntity extends BaseEntity implements Serializable {

    public TbmListMenuEntity() {

    }

    @Id
    @Column(name = "list_menu_id", nullable = false, unique = true, length = 150)
    private String listMenuId;

    @Column(name = "list_menu_name", nullable = false, length = 250)
    private String listMenuName;
}
