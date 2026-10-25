package com.azrecommendation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.azrecommendation.movieentity.MovieEntity;
import com.azrecommendation.service.MovieService;

@RestController
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping("/movies/{letter}")
    public List<MovieEntity> getMovies(@PathVariable String letter) {
        return movieService.getMoviesByLetter(letter);
    }
    @GetMapping("/movies/suggestions")
    public List<MovieEntity> getMovieSuggestions(@RequestParam String query){
        return movieService.getMovieSuggestions(query);
    }
    @GetMapping("/movies/search")
    public List<MovieEntity> searchMovie(@RequestParam String query){
        return movieService.searchMovie(query);
    }

}