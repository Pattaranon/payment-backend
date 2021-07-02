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
@Table(name = "tb_m_payment")
public class TbmPaymentEntity extends BaseEntity implements Serializable {

    public TbmPaymentEntity() {
    }

    @Id
    @Column(name = "payment_id", nullable = false, unique = true, length = 150)
    private String paymentId;

    @Column(name = "payment_name", length = 350)
    private String paymentName;
}
