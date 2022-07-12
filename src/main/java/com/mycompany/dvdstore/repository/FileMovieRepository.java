package com.mycompany.dvdstore.repository;

import com.mycompany.dvdstore.entity.Movie;

import java.io.FileWriter;
import java.io.IOException;

public class FileMovieRepository implements MovieRepositoryInterface {
    FileWriter writer;

    @Override
    public void add(Movie movie) {
        try {
            writer = new FileWriter("C:\\temp\\movies.txt", true);
            writer.write(movie.getTitle() + ";" + movie.getGenre() + "\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
