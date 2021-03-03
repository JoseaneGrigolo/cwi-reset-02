package br.com.cwi.resetflix.request;

import java.util.List;

public class CriarAtorRequest {

    private String nome;
    private List<Long> idFilmes;
    private List<Long> idSeries;

    public CriarAtorRequest(String nome, List<Long> idFilmes, List<Long> idSeries) {
        this.nome = nome;
        this.idFilmes = idFilmes;
        this.idSeries = idSeries;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Long> getIdFilmes() {
        return idFilmes;
    }

    public void setIdFilmes(List<Long> idFilmes) {
        this.idFilmes = idFilmes;
    }

    public List<Long> getIdSeries() {
        return idSeries;
    }

    public void setIdSeries(List<Long> idSeries) {
        this.idSeries = idSeries;
    }
}
