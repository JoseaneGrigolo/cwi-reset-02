package br.com.cwi.resetflix.entity;

import br.com.cwi.resetflix.domain.Genero;

import java.util.List;

public class SerieEntity {

    private Long id;
    private String nome;
    private Genero genero;
    private Long idTemporadas;
    private Long idEpisodios;
    private List<Long> idsAtores;

    public SerieEntity(String nome, Genero genero, Long idTemporadas, Long idEpisodios, List<Long> idsAtores) {
        this.nome = nome;
        this.genero = genero;
        this.idTemporadas = idTemporadas;
        this.idEpisodios = idEpisodios;
        this.idsAtores = idsAtores;
    }

    public SerieEntity(Long id, String nome, Genero genero, Long idTemporadas, Long idEpisodios, List<Long> idsAtores) {
        this.id = id;
        this.nome = nome;
        this.genero = genero;
        this.idTemporadas = idTemporadas;
        this.idEpisodios = idEpisodios;
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

    public Long getIdTemporadas() {
        return idTemporadas;
    }

    public void setIdTemporradas(Long idTemporadas) {
        this.idTemporadas = idTemporadas;
    }

    public Long getIdEpisodios() {
        return idEpisodios;
    }

    public void setIdEpisodios(Long idEpisodios) {
        this.idEpisodios = idEpisodios;
    }

    public List<Long> getIdsAtores() {
        return idsAtores;
    }

    public void setIdsAtores(List<Long> idsAtores) {
        this.idsAtores = idsAtores;
    }
}
