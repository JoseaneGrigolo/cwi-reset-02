package br.com.cwi.resetflix.domain;

public class SerieAssistida {

    private Long id;
    private Integer idTemporada;
    private Integer idEpisodio;

    public SerieAssistida(Long id, Integer idTemporada, Integer idEpisodio) {
        this.id = id;
        this.idTemporada = idTemporada;
        this.idEpisodio = idEpisodio;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getIdTemporada() {
        return idTemporada;
    }

    public void setIdTemporada(Integer idTemporada) {
        this.idTemporada = idTemporada;
    }

    public Integer getIdEpisodio() {
        return idEpisodio;
    }

    public void setIdEpisodio(Integer idEpisodio) {
        this.idEpisodio = idEpisodio;
    }
}
