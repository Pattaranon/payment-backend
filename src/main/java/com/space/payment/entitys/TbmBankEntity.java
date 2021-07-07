package com.space.payment.entitys;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@EqualsAndHashCode(callSuper = true)
@Data
@Table(name = "tb_m_bank")
public class TbmBankEntity extends BaseEntity implements Serializable {
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "bank_id", nullable = false, unique = true, length = 150)
    private String bankId;

    @Column(name = "bank_name", length = 250)
    private String bankName;

    @Column(name = "account_no", length = 30)
    private String accountNo;
}
