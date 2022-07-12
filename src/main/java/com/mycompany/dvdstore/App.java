package com.mycompany.dvdstore;

import com.mycompany.dvdstore.controller.MovieController;
import com.mycompany.dvdstore.repository.GoLiveMovieRepository;
import com.mycompany.dvdstore.service.MovieService;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) {
        // Instanciation du contrôleur
        MovieController movieController = new MovieController();

        // Instanciation du service
        MovieService movieService = new MovieService();
        // injection du service dans le controleur via le setter
        movieController.setMovieServiceInterface(movieService);

        // Instanciation du repository
        GoLiveMovieRepository goLiveMovieRepository = new GoLiveMovieRepository();
        // injection du repository dans le service via le setter
        movieService.setMovieRepositoryInterface(goLiveMovieRepository);

        // Appel du contrôleur
        movieController.addUsingConsole();
    }
}

