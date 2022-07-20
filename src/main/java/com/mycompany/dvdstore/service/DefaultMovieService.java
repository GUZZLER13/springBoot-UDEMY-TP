package com.mycompany.dvdstore.service;

import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.repository.MovieRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;

public class DefaultMovieService implements MovieServiceInterface {
    @Autowired

    MovieRepositoryInterface movieRepositoryInterface;

    public void setMovieRepositoryInterface(MovieRepositoryInterface movieRepositoryInterface) {
        this.movieRepositoryInterface = movieRepositoryInterface;
    }

    @Override
    public void registerMovie(Movie movie) {
        movieRepositoryInterface.add(movie);
    }
}
