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
@Table(name = "tb_t_payment")
public class TbtPaymentEntity extends BaseEntity implements Serializable {

    public TbtPaymentEntity() {
    }

    @Id
    @Column(name = "id", length = 100)
    private String Id;

    @Column(name = "menu_id", nullable = false, unique = true, length = 150)
    private String menuId;

    @Column(name = "payment_id", nullable = false, unique = true, length = 150)
    private String paymentId;

    @Column(name = "price_per_month")
    private float pricePerMonth;

    @Column(name = "is_pay")
    private boolean isPay;
}
