package com.nipunya.demo.domain.vehicle.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "price", schema = "vehicle", uniqueConstraints = {
        @UniqueConstraint(name = "UniqueConfigurationAndRegion", columnNames = {"configuration_id", "price_region_id"})
})
public class Price {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "configuration_id", nullable = false)
    private Configuration configuration;

    @ManyToOne(optional = false)
    @JoinColumn(name = "price_region_id", nullable = false)
    private PriceRegion priceRegion;

    @Column(name = "amount", nullable = false, precision = 19, scale = 2)
    private BigDecimal amount;

}