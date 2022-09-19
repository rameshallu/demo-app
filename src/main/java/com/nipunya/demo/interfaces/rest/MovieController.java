package com.nipunya.demo.interfaces.rest;

import com.nipunya.demo.domain.service.MovieCatalogService;
import com.nipunya.demo.domain.service.MovieDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import java.util.List;
import java.util.Optional;

//@Validated
//@RestController
//@RequestMapping("/api/movies")
public class MovieController {

    private final MovieCatalogService movieCatalogService;


//    @Autowired(required = false)
//    private TopratedMovie dsdsfsdf;

    public MovieController(Optional<MovieCatalogService> movieCatalogService) {
        this.movieCatalogService = movieCatalogService.get();
    }


//    public MovieController(MovieCatalogService movieCatalogService, TopratedMovieService serere) {
//        this.movieCatalogService = movieCatalogService;
//    }

    @GetMapping
    public List<MovieDto> get() {
        return movieCatalogService.getMovies();
    }

    @PostMapping
    public List<MovieDto> post(@RequestBody @NotEmpty(message = "List cannot be empty") List<@Valid MovieDto> movies) {
        return movieCatalogService.addMovies(movies);
    }
}
