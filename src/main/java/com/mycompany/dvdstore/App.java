package com.mycompany.dvdstore;

import com.mycompany.dvdstore.controller.MovieController;
import com.mycompany.dvdstore.repository.FileMovieRepository;
import com.mycompany.dvdstore.service.DefaultMovieService;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) {
        // Instanciation du contrôleur
        MovieController movieController = new MovieController();

        // Instanciation du service
        DefaultMovieService defaultMovieService = new DefaultMovieService();
        // injection du service dans le controleur via le setter
        movieController.setMovieServiceInterface(defaultMovieService);

        // Instanciation du repository
        FileMovieRepository fileMovieRepository = new FileMovieRepository();
        // injection du repository dans le service via le setter
        defaultMovieService.setMovieRepositoryInterface(fileMovieRepository);

        // Appel du contrôleur
        movieController.addUsingConsole();
    }
}

