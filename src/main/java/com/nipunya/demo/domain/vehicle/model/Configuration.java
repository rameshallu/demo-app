package com.nipunya.demo.domain.vehicle.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "configuration")
public class Configuration {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "version_id", nullable = false)
    private Version version;

    @ManyToOne(optional = false)
    @JoinColumn(name = "variant_id", nullable = false)
    private Variant variant;

    @ManyToOne(cascade = CascadeType.DETACH, optional = false)
    @JoinColumn(name = "trim_id", nullable = false)
    private Trim trim;

    @ManyToOne(optional = false)
    @JoinColumn(name = "style_id", nullable = false)
    private Style style;

}