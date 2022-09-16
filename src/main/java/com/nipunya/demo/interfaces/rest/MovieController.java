package com.nipunya.demo.interfaces.rest;

import com.nipunya.demo.domain.service.MovieCatalogService;
import com.nipunya.demo.domain.service.MovieDto;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@Validated
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
    public List<MovieDto> post(@RequestBody @NotEmpty(message = "List cannot be empty") List<@Valid MovieDto> movies) {
        return movieCatalogService.addMovies(movies);
    }
}
