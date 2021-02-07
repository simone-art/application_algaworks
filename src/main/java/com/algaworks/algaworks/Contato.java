package com.algaworks.algaworks;

public class Contato {

    //private modificador de accesso do Java para indicar
    // que estes atributos só pertencem a esta classe Contato
    //é só ela poderá permitir o acceso a seus métodos
    private String id;
    private String nome;
    private String telefone;

    //Encapsulamento com o Get o Setter


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
