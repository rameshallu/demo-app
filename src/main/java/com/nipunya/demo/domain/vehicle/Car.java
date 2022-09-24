package com.nipunya.demo.domain.vehicle;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "car", schema = "vehicle")
public class Car extends Vehicle {
}