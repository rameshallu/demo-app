package com.nipunya.demo.domain.vehicle.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "transmission", schema = "vehicle")
public class Transmission {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "speed", nullable = false)
    private Integer speed;

    @ManyToOne(optional = false)
    @JoinColumn(name = "transmission_type_id", nullable = false)
    private TransmissionType transmissionType;

}