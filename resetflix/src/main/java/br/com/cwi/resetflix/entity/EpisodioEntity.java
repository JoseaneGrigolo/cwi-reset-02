package br.com.cwi.resetflix.entity;

import java.util.List;

public class EpisodioEntity {

    private Long id;
    private String nome;
    private List<Long> idsSeries;

    public EpisodioEntity(final String nome, final List<Long> idsSeries) {
        this.nome = nome;
        this.idsSeries = idsSeries;
    }

    public EpisodioEntity(final Long id, final String nome, final List<Long> idsSeries) {
        this.id = id;
        this.nome = nome;
        this.idsSeries = idsSeries;
    }

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(final String nome) {
        this.nome = nome;
    }

    public List<Long> getIdsSeries() {
        return idsSeries;
    }

    public void setIdsSeries(final List<Long> idsSeries) {
        this.idsSeries = idsSeries;
    }
}
