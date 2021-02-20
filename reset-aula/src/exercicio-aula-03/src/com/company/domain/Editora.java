package com.company.domain;

import com.company.exceptions.EditoraInvalidaException;

public class Editora {

    private String nome;
    private String localizacao;

   public Editora(String nome, String localizacao) {
        if(nome.equalsIgnoreCase("DC Comics")){
            throw new EditoraInvalidaException("Você não pode usar este nome!");
        }
        this.nome = nome;
        this.localizacao = localizacao;
    }
    public String getNome() {
        return nome;
    }

    public String getLocalizacao() {
        return localizacao;
    }

}
