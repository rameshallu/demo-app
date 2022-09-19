package com.nipunya.demo;

import com.nipunya.demo.domain.repository.MovieRepository;
import com.nipunya.demo.domain.service.MovieCatalogService;
import com.nipunya.demo.domain.service.MovieCatalogServiceImpl;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("prod")
public class ProductionConfiguration {

    public MovieCatalogService movieCatalogService(MovieRepository movieRepository) {
        return new MovieCatalogServiceImpl(movieRepository);
    }
}
