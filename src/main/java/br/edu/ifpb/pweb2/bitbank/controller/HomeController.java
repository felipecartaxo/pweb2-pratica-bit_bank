package br.edu.ifpb.pweb2.bitbank.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/home")
    public String showHomepage() {
        //Indico que página html (dentro de templates) será retornada
        return "index";
        // return "protegido";
    }

}
