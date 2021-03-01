package br.com.cwi.resetflix.response;

import java.util.List;

import br.com.cwi.resetflix.domain.Genero;

public class ConsultarDetalhesSerieResponse {

    private Long id;
    private String nome;
    private Genero genero;
    private TemporadasResponse temporada;
    private EpisodiosResponse episodios;
    private List<AtoresResponse> atores;

    public ConsultarDetalhesSerieResponse(Long id, String nome, Genero genero, TemporadasResponse temporada, EpisodiosResponse episodios, List<AtoresResponse> atores) {
        this.id = id;
        this.nome = nome;
        this.genero = genero;
        this.temporada = temporada;
        this.episodios = episodios;
        this.atores = atores;
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

    public TemporadasResponse getTemporada() {
        return temporada;
    }

    public void setTemporada(TemporadasResponse temporada) {
        this.temporada = temporada;
    }

    public EpisodiosResponse getEpisodios() {
        return episodios;
    }

    public void setEpisodios(EpisodiosResponse episodios) {
        this.episodios = episodios;
    }

    public List<AtoresResponse> getAtores() {
        return atores;
    }

    public void setAtores(List<AtoresResponse> atores) {
        this.atores = atores;
    }
}
