package com.nipunya.demo.domain.vehicle;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "bike")
public class Bike extends Vehicle {


}