package com.azrecommendation.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.azrecommendation.movieentity.MovieEntity;

public interface MovieRepository extends JpaRepository<MovieEntity, Integer> {

    List<MovieEntity> findByLetterIgnoreCase(String letter);
    List<MovieEntity> findByMovieNameStartingWithIgnoreCase(String movieName);
    List<MovieEntity> findByMovieNameIgnoreCase(String movieName);

}