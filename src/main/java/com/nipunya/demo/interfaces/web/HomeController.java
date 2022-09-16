package com.nipunya.demo.interfaces.web;

import com.nipunya.demo.domain.service.MovieCatalogService;
import com.nipunya.demo.domain.service.MovieDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/")
public class HomeController {

    private final MovieCatalogService movieCatalogService;

    public HomeController(MovieCatalogService movieCatalogService) {
        this.movieCatalogService = movieCatalogService;
    }

    @GetMapping
    public String index(Model model) {
        List<MovieDto> movies = movieCatalogService.getMovies();
        model.addAttribute("topBoMovies", movies);
        return "index";
    }

}
