package com.nipunya.demo.domain.service;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class MovieDto {
    private Integer id;
    @NotBlank(message = "name cannot be empty")
    @Size(min = 3, message = "name must have minimum 3 characters")
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
