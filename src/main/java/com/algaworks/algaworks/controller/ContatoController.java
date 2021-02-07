package com.algaworks.algaworks.controller;

import org.springframework.stereotype.Controller;

@Controller
public class ContatoController {

    //Criado método para invocar que no browser aparezca a página index
    public String index(){
        return "index";
    }

}
