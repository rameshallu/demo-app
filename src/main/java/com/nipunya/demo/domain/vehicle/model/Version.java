package com.nipunya.demo.domain.vehicle.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


/**
 * The difference between VERSION and VARIANT is that a new version is an improvement
 * to an existing product whereas a variation is when the product is altered in some way
 * for a different target audience or usage.
 */
@Getter
@Setter
@Entity
@Table(name = "version", schema = "vehicle")
public class Version {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "year", nullable = false)
    private Integer year;

    @ManyToOne(optional = false)
    @JoinColumn(name = "model_id", nullable = false)
    private Model model;

}
