package com.nipunya.demo.domain.vehicle.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "configuration", schema = "vehicle")
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

    @ManyToOne
    @JoinColumn(name = "style_id")
    private Style style;

    @ManyToOne(optional = false)
    @JoinColumn(name = "make_id", nullable = false)
    private Make make;

    @ManyToOne(optional = false)
    @JoinColumn(name = "model_id", nullable = false)
    private Model model;

    @Column(name = "seater")
    private Integer seater;

    @ManyToOne
    @JoinColumn(name = "transmission_id")
    private Transmission transmission;

    @ManyToOne
    @JoinColumn(name = "paint_type_id")
    private PaintType paintType;

    @ManyToOne
    @JoinColumn(name = "fuel_type_id")
    private FuelType fuelType;

}