package com.mycompany.dvdstore;

import com.mycompany.dvdstore.controller.MovieController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * Hello world!
 */
@SpringBootApplication
public class App {


    public static void main(String[] args) {

        // les lignes commentées ci-dessous étaient là avant de créer les beans et de rajouter les dépendances de spring dans le pom.xml

//        // Instanciation du contrôleur
//        MovieController movieController = new MovieController();
//
//        // Instanciation du service
//        DefaultMovieService defaultMovieService = new DefaultMovieService();
//        // injection du service dans le controleur via le setter
//        movieController.setMovieServiceInterface(defaultMovieService);
//
//        // Instanciation du repository
//        FileMovieRepository fileMovieRepository = new FileMovieRepository();
//        // injection du repository dans le service via le setter
//        defaultMovieService.setMovieRepositoryInterface(fileMovieRepository);


        ApplicationContext context = SpringApplication.run(App.class, args);
        MovieController movieController = context.getBean(MovieController.class);


        // Appel du contrôleur
        movieController.addUsingConsole();
    }
}

