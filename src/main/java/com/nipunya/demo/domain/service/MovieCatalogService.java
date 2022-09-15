package com.nipunya.demo.domain.service;

import java.util.List;

public interface MovieCatalogService {
     List<MovieDto> getMovies();

     List<MovieDto> addMovies(List<MovieDto> movies);
}
