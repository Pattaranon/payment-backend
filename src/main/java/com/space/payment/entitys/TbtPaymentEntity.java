package com.space.payment.entitys;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@Table(name = "tb_t_payment")
public class TbtPaymentEntity extends BaseEntity implements Serializable {

    public TbtPaymentEntity() {
        // Create constructor
    }

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
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
