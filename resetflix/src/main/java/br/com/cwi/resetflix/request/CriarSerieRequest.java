package br.com.cwi.resetflix.request;

import br.com.cwi.resetflix.domain.Genero;

import java.util.List;

public class CriarSerieRequest {

    private String nome;
    private Long idTemporada;
    private Long idEpisodio;
    private List<Long> idsAtores;
    private Genero genero;

    public CriarSerieRequest(String nome, Long idTemporada, Long idEpisodio, List<Long> idsAtores, Genero genero) {
        this.nome = nome;
        this.idTemporada = idTemporada;
        this.idEpisodio = idEpisodio;
        this.idsAtores = idsAtores;
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getIdTemporada() {
        return idTemporada;
    }

    public void setIdTemporada(Long idTemporada) {
        this.idTemporada = idTemporada;
    }

    public Long getIdEpisodio() {
        return idEpisodio;
    }

    public void setIdEpisodio(Long idEpisodio) {
        this.idEpisodio = idEpisodio;
    }

    public List<Long> getIdsAtores() {
        return idsAtores;
    }

    public void setIdsAtores(List<Long> idsAtores) {
        this.idsAtores = idsAtores;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }
}
