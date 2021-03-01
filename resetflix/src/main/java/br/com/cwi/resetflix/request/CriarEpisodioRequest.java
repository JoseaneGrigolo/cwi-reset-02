package br.com.cwi.resetflix.request;

import java.util.List;

public class CriarEpisodioRequest {
    private String nome;
    private List<Long> idSeries;

    public CriarEpisodioRequest(final String nome, final List<Long> idSeries) {
        this.nome = nome;
        this.idSeries = idSeries;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(final String nome) {
        this.nome = nome;
    }

    public List<Long> getIdSeries() {
        return idSeries;
    }

    public void setIdSeries(final List<Long> idSeries) {
        this.idSeries = idSeries;
    }
}
