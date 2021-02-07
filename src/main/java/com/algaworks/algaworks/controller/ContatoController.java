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
        Contato contato = new Contato();
        contato.setId("1");
        contato.setNome("João");
        contato.setTelefone("11 9999 8888");
        LISTA_CONTATOS.add(contato);
    }

    //Criado método para invocar que no browser aparezca a página index
    //@ @GetMapping Configura que o framework saiba qual enderereço digitado no browser
    // vai disparar este método e renderizar a p[agina no browser
    @GetMapping("/")
    public String index(){
        return "index";
    }

}
