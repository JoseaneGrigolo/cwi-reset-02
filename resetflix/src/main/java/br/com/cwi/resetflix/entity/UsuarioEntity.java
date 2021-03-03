package br.com.cwi.resetflix.entity;

import br.com.cwi.resetflix.domain.SerieAssistida;

import java.util.ArrayList;
import java.util.List;

public class UsuarioEntity {

    private Long id;
    private String nome;
    private List<Long> idsFilmesAssistidos = new ArrayList<Long>();
    private List<SerieAssistida> seriesAssistidas = new ArrayList<SerieAssistida>();

    public UsuarioEntity(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public List<Long> getIdsFilmesAssistidos() {
        return idsFilmesAssistidos;
    }

    public List<SerieAssistida> getSeriesAssistidas() {
        return seriesAssistidas;
    }

    public void assistirFilme(Long id) {
        this.idsFilmesAssistidos.add(id);
    }

    public void assistirSerie(Long idSerie, Integer idTemporada, Integer idEpisodio) {
        this.seriesAssistidas.add(new SerieAssistida(idSerie, idTemporada, idEpisodio));
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
}
