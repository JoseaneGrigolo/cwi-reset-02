package br.com.cwi.resetflix.response;

import java.util.List;

public class ConsultarDetalhesEpisodioResponse {

    private Long id;
    private String nome;
    private List<SerieResponse> series;

    public ConsultarDetalhesEpisodioResponse(final Long id, final String nome,
                                         final List<SerieResponse> series) {
        this.id = id;
        this.nome = nome;
        this.series = series;
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

    public List<SerieResponse> getSeries() {
        return series;
    }

    public void setFilmes(final List<SerieResponse> series) {
        this.series = series;
    }
}
