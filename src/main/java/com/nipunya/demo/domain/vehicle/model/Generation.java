package com.nipunya.demo.domain.vehicle.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "generation")
public class Generation {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "model_id", nullable = false)
    private Model model;

    @Column(name = "which", nullable = false)
    private Integer which;

    @Column(name = "launch_date")
    private LocalDate launchDate;

}