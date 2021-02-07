package com.algaworks.algaworks.controller;

import com.algaworks.algaworks.Contato;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class ContatoController {

    private static final ArrayList<Contato>  LISTA_CONTATOS = new ArrayList<>();

    //Método estático para adicionar alguns contatos
    static{
        LISTA_CONTATOS.add(new Contato("1", "Maria", "+55 11 9999 8888"));
        LISTA_CONTATOS.add(new Contato("2", "Pedro", "+55 34 1111 2222"));
        LISTA_CONTATOS.add(new Contato("3", "João", "+55  35 3333 0000"));
        LISTA_CONTATOS.add(new Contato("4", "Nicolas", "+55 34 7777 8888"));
        LISTA_CONTATOS.add(new Contato("5", "Whitney", "+55 34 6666 9923"));
    }

    //Criado método para invocar que no browser aparezca a página index
    //@ @GetMapping Configura que o framework saiba qual enderereço digitado no browser
    // vai disparar este método e renderizar a p[agina no browser
    @GetMapping("/")
    public String index(){
        return "index";
    }

}
