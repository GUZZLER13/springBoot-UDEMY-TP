package com.mycompany.dvdstore;

import com.mycompany.dvdstore.entity.Movie;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) {
        System.out.println("quel est le titre du film ?");
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        Movie movie = new Movie();
        movie.setTitle(title);

        System.out.println("quel est le genre du film ?");
        String genre = scanner.nextLine();
        movie.setGenre(genre);
        System.out.println("ajout du film : " + movie.getTitle() + " qui est du genre " + movie.getGenre());
    }
}

