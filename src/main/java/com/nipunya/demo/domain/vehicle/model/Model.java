package com.nipunya.demo.domain.vehicle.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "model")
public class Model {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "name", nullable = false)
    private String name;

    @ManyToOne(optional = false)
    @JoinColumn(name = "make_id", nullable = false)
    private Make make;

}