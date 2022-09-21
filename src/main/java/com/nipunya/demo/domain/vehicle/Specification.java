package com.nipunya.demo.domain.vehicle;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Getter
@Setter
@Embeddable
public class Specification {
    @Column(name = "fuel_type")
    private String fuelType;

    @Column(name = "cubic_capacity")
    private Integer cubicCapacity;

}