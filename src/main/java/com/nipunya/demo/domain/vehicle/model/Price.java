package com.nipunya.demo.domain.vehicle.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "price", uniqueConstraints = {
        @UniqueConstraint(name = "UniqueRegionAndAmount", columnNames = {"region", "amount"})
})
public class Price {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "configuration_id", nullable = false)
    private Configuration configuration;

    @Column(name = "region", nullable = false)
    private String region;

    @Column(name = "amount", nullable = false, precision = 19, scale = 2)
    private BigDecimal amount;

}