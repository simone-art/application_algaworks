package com.algaworks.algaworks;

public class Contato {

    //Esta classe contato segue o padrão Java Bean: atributos com classe private,
    // elas não são accessadas externamente. Elas só podems er accesadas por métodos
    //que pertencem a essa classe. Para ser accesada por outra classe, os atributos devem ser public
    //Outro padrão são os getters e os setters. set é atribuir valor. Get é obter valor
    //Resumo do padrão Java Bean: criar propiedades tipo private, e dar acceso a elas através dos
    //métodos Getters e Setters.
    //O ThymeLeaf também usa o padrão Java Bean ao invocar o GetNome, por exemplo
    // que é um método de retorno estático.

    //private modificador de accesso do Java para indicar
    // que estes atributos só pertencem a esta classe Contato
    //é só ela poderá permitir o acceso a seus métodos
    private String id;
    private String nome;
    private String telefone;

    //Constructor da classe Contato sem implementação chama o método new Contato
    //Não é neccesário colocá-lo
    public Contato(){

    }

    //Este constructor suprime o que esta encima, e éste sim pode ser usado
    //This = indica para o Java que o id faz a referência da instância e não para o parámetro
    //Constructor específico que recebe todos os parámetros da classe Contato
    public Contato(String id, String nome, String telefone) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
    }

    //Método criado pars saber se pessoa que está usando o cadastro,
    // está fazendo um novo ou alterando algum dado.
    // Se ele for null, o cadastro é novo. Senão, ele é atualizado.
    public boolean IsNovo(){
        return id == null;
    }

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
