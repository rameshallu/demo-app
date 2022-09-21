package com.nipunya.demo.domain.vehicle;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface BikeRepository extends JpaRepository<Bike, Integer> {
}