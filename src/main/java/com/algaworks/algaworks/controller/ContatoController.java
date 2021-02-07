package com.algaworks.algaworks.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContatoController {

    //Criado método para invocar que no browser aparezca a página index
    @GetMapping("/index")
    public String index(){
        return "index";
    }

}
