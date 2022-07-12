package com.mycompany.dvdstore.repository;

import com.mycompany.dvdstore.entity.Movie;

import java.util.ArrayList;
import java.util.List;

public class MemoryMovieRepository {

    private final static List<Movie> movies = new ArrayList<>();

    public void add(Movie movie) {
        // add movie to database.
        movies.add(movie);
        System.out.println("The movie " + movie.getTitle() + " has been added.");
    }
}
