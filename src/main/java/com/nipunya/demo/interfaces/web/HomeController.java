package com.nipunya.demo.interfaces.web;

import com.nipunya.demo.domain.service.MovieCatalogService;
import com.nipunya.demo.domain.service.MovieDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
//@RequestMapping("/home")
public class HomeController {

    private final MovieCatalogService movieCatalogService;

    public HomeController(MovieCatalogService movieCatalogService) {
        this.movieCatalogService = movieCatalogService;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/home")
    public String index(Model model) {
        List<MovieDto> movies = movieCatalogService.getMovies();
        model.addAttribute("topBoMovies", movies);
        return "index";
    }

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }

}
