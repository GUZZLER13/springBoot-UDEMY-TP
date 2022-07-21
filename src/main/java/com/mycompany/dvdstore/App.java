package com.mycompany.dvdstore;

import com.mycompany.dvdstore.controller.MovieController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Hello world!
 */
@Configuration
@ComponentScan(basePackages = {"com.mycompany.dvdstore.controller", "com.mycompany.dvdstore.service, com.mycompany.dvdstore.repository", "com.mycompany.dvdstore.controller"})
@PropertySource("classpath:application.properties")
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


        ApplicationContext context = new AnnotationConfigApplicationContext(App.class);
        MovieController movieController = context.getBean(MovieController.class);


        // Appel du contrôleur
        movieController.addUsingConsole();
    }
}

