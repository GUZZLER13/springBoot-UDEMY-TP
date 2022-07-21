package com.mycompany.dvdstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AboutUsController {
    @RequestMapping("/about-us")
    public String displayFullDetails() {
        System.out.println("Tentative de l'affichage de la page AboutUs");
        return "about-us";
    }
}
