package com.company.domain;

import com.company.exceptions.EditoraInvalidaException;

public class Editora {

    private String nome;
    private String localizacao;

   public Editora(String nome, String localizacao) {
        validarNome(nome);
        this.nome = nome;
        this.localizacao = localizacao;
    }
    public String getNome() {
        return nome;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    private void validarNome(String nome){
        if(nome.equalsIgnoreCase("DC Comics")){
            throw new EditoraInvalidaException("Você não pode usar este nome!");
        }
    }

}
