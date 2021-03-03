package br.com.cwi.resetflix.service;

import br.com.cwi.resetflix.domain.Genero;
import br.com.cwi.resetflix.domain.SerieAssistida;
import br.com.cwi.resetflix.entity.FilmeEntity;
import br.com.cwi.resetflix.entity.SerieEntity;
import br.com.cwi.resetflix.exception.UsuarioDesocupadoException;
import br.com.cwi.resetflix.mapper.FilmeResponseMapper;
import br.com.cwi.resetflix.mapper.SerieResponseMapper;
import br.com.cwi.resetflix.repository.FilmeRepository;
import br.com.cwi.resetflix.repository.SeriesRepository;
import br.com.cwi.resetflix.repository.UsuarioRepository;
import br.com.cwi.resetflix.response.FilmeResponse;
import br.com.cwi.resetflix.response.SerieResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private FilmeRepository filmeRepository;

    @Autowired
    private SeriesRepository serieRepository;

    static FilmeResponseMapper MAPPER_FILME = new FilmeResponseMapper();
    static SerieResponseMapper MAPPER_SERIE = new SerieResponseMapper();

    public void assistirFilme(Long id) {
        usuarioRepository.assistirFilme(id);
    }

    public void assistirSerie(Long idSerie, Integer idTemporada, Integer idEpisodio) {
        usuarioRepository.assistirSerie(idSerie, idTemporada, idEpisodio);
    }

    public List<FilmeResponse> getRecomendacoes() {
        List<Long> idAssistidos = usuarioRepository.getFilmesAssistidos();
        if (idAssistidos.isEmpty()) {
            throw new UsuarioDesocupadoException("Não assistiu nada!");
        }
        List<FilmeEntity> assistidos = new ArrayList<FilmeEntity>();
        for (Long id : idAssistidos) {
            FilmeEntity filmeEntity = filmeRepository.acharFilme(id);
            assistidos.add(filmeEntity);
        }
        return MAPPER_FILME.mapear(assistidos);
    }

    public List<SerieResponse> getRecomendacao() {
        List<SerieAssistida> seriesAssistidas = usuarioRepository.getSeriesAssistidas();
        if (seriesAssistidas.isEmpty()) {
            throw new UsuarioDesocupadoException("Não assistiu nada!");
        }

        List<Genero> generos = new ArrayList<Genero>();

        for (SerieAssistida serieAssistida : seriesAssistidas) {
            SerieEntity serieEntity = serieRepository.acharSerie(serieAssistida.getId());
            generos.add(serieEntity.getGenero());
        }

        /*
         TODO
        1. Achar genero mais assistido
        2. Buscar todas as series do genero mais assistido
        3. Remover series ja assistidas da lista que buscou
         */

        return null;
    }

}
