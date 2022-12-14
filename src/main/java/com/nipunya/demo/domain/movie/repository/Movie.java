package com.nipunya.demo.domain.movie.repository;

import javax.persistence.*;

@Entity
@Table(name = "movie", schema = "movie")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name="name", nullable = false)
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}