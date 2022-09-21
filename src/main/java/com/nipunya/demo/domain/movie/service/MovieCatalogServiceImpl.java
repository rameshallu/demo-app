package com.nipunya.demo.domain.movie.service;

import com.nipunya.demo.domain.movie.repository.Movie;
import com.nipunya.demo.domain.movie.repository.MovieRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
public class MovieCatalogServiceImpl implements MovieCatalogService {

    private final MovieRepository movieRepository;

    public MovieCatalogServiceImpl(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    public List<MovieDto> getMovies() {
        return mapEntitiesToDtos(movieRepository.findAll());
    }

    @Override
    public List<MovieDto> addMovies(List<MovieDto> movies) {
        return mapEntitiesToDtos(movieRepository.saveAll(mapDtosToEntities(movies)));
    }

    private List<MovieDto> mapEntitiesToDtos(List<Movie> entities) {
        return entities.stream().map(this::mapEnitityToDto).toList();
    }
    private List<Movie> mapDtosToEntities(List<MovieDto> dtos) {
//        return dtos.stream().map(dto -> mapDtoToEntity(dto)).toList();
        return dtos.stream().map(this::mapDtoToEntity).toList();
    }

    private MovieDto mapEnitityToDto(Movie entity) {
        MovieDto dto = new MovieDto();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        return dto;
    }

    private Movie mapDtoToEntity(MovieDto dto) {
        Movie entity = new Movie();
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        return entity;
    }
}
