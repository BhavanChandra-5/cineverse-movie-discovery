package com.azrecommendation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.azrecommendation.movieentity.MovieEntity;
import com.azrecommendation.repository.MovieRepository;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public List<MovieEntity> getMoviesByLetter(String letter) {
        return movieRepository.findByLetterIgnoreCase(letter);
    }
    public List<MovieEntity> getMovieSuggestions(String movieName){
        return movieRepository.findByMovieNameStartingWithIgnoreCase(movieName);
    }
    public List<MovieEntity> searchMovie(String movieName){
        return movieRepository.findByMovieNameIgnoreCase(movieName);
    }

}