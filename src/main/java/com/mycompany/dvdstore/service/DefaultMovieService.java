package com.mycompany.dvdstore.service;

import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.repository.MovieRepositoryInterface;

public class DefaultMovieService implements MovieServiceInterface {
    MovieRepositoryInterface movieRepositoryInterface;

    public void setMovieRepositoryInterface(MovieRepositoryInterface movieRepositoryInterface) {
        this.movieRepositoryInterface = movieRepositoryInterface;
    }

    @Override
    public void registerMovie(Movie movie) {
        movieRepositoryInterface.add(movie);
    }
}
