package com.nipunya.demo.rest;

import com.nipunya.demo.domain.service.MovieCatalogService;
import com.nipunya.demo.domain.service.MovieDto;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/movies")
public class MovieController {

    private final MovieCatalogService movieCatalogService;

    public MovieController(MovieCatalogService movieCatalogService) {
        this.movieCatalogService = movieCatalogService;
    }

    @GetMapping
    public List<MovieDto> get() {
        return movieCatalogService.getMovies();
    }

    @PostMapping
    public List<MovieDto> post(@RequestBody List<MovieDto> movies) {
        return movieCatalogService.addMovies(movies);
    }
}
