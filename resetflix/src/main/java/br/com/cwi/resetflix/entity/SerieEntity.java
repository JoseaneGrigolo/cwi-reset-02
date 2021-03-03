package br.com.cwi.resetflix.entity;

import br.com.cwi.resetflix.domain.Genero;

import java.util.List;

public class SerieEntity {

    private Long id;
    private String nome;
    private Genero genero;
    private Long qtdTemporadas;
    private Long qtdEpisodios;
    private List<Long> idsAtores;

    public SerieEntity(String nome, Genero genero, Long qtdTemporadas, Long qtdEpisodios, List<Long> idsAtores) {
        this.nome = nome;
        this.genero = genero;
        this.qtdTemporadas = qtdTemporadas;
        this.qtdEpisodios = qtdEpisodios;
        this.idsAtores = idsAtores;
    }

    public SerieEntity(Long id, String nome, Genero genero, Long qtdTemporadas, Long qtdEpisodios, List<Long> idsAtores) {
        this.id = id;
        this.nome = nome;
        this.genero = genero;
        this.qtdTemporadas = qtdTemporadas;
        this.qtdEpisodios = qtdEpisodios;
        this.idsAtores = idsAtores;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Long getQtdTemporadas() {
        return qtdTemporadas;
    }

    public void setQtdTemporadas(Long qtdTemporadas) {
        this.qtdTemporadas = qtdTemporadas;
    }

    public Long getQtdEpisodios() {
        return qtdEpisodios;
    }

    public void setQtdEpisodios(Long qtdEpisodios) {
        this.qtdEpisodios = qtdEpisodios;
    }

    public List<Long> getIdsAtores() {
        return idsAtores;
    }

    public void setIdsAtores(List<Long> idsAtores) {
        this.idsAtores = idsAtores;
    }
}

