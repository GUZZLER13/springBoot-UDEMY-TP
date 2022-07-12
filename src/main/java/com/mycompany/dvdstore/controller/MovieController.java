package com.mycompany.dvdstore.controller;

import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.service.MovieServiceInterface;

import java.util.Scanner;

public class MovieController {
    private MovieServiceInterface movieServiceInterface;

    public void setMovieServiceInterface(MovieServiceInterface movieServiceInterface) {
        this.movieServiceInterface = movieServiceInterface;
    }

    public void addUsingConsole() {

        System.out.println("quel est le titre du film ?");
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        Movie movie = new Movie();
        movie.setTitle(title);

        System.out.println("quel est le genre du film ?");
        String genre = scanner.nextLine();
        movie.setGenre(genre);
        System.out.println("ajout du film : " + movie.getTitle() + " qui est du genre " + movie.getGenre());

        movieServiceInterface.registerMovie(movie);
    }
}