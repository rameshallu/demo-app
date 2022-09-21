package com.nipunya.demo.domain.vehicle;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@MappedSuperclass
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "registration_number", nullable = false)
    private String registrationNumber;

    @Embedded
    private Specification specification;

}