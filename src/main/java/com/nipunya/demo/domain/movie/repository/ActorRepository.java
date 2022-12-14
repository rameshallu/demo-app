package com.nipunya.demo.domain.movie.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ActorRepository extends JpaRepository<Actor, Integer> {
}
