package br.com.cwi.resetflix.repository;

import br.com.cwi.resetflix.domain.SerieAssistida;
import br.com.cwi.resetflix.entity.UsuarioEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UsuarioRepository {

    static UsuarioEntity usuario = new UsuarioEntity(1L, "Joseane");

    public void assistirFilme(Long id) {
        this.usuario.assistirFilme(id);
    }

    public void assistirSerie(Long idSerie, Integer idTemporada, Integer idEpisodio) {
        this.usuario.assistirSerie(idSerie, idTemporada, idEpisodio);
    }

    public List<Long> getFilmesAssistidos() {
        return this.usuario.getIdsFilmesAssistidos();
    }

    public List<SerieAssistida> getSeriesAssistidas() {
        return this.usuario.getSeriesAssistidas();
    }
}
