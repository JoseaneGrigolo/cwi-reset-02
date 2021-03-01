package br.com.cwi.resetflix.service;

import br.com.cwi.resetflix.entity.DiretorEntity;
import br.com.cwi.resetflix.entity.FilmeEntity;
import br.com.cwi.resetflix.entity.SerieEntity;
import br.com.cwi.resetflix.entity.TemporadaEntity;
import br.com.cwi.resetflix.mapper.*;
import br.com.cwi.resetflix.repository.DiretoresRepository;
import br.com.cwi.resetflix.repository.FilmeRepository;
import br.com.cwi.resetflix.repository.SeriesRepository;
import br.com.cwi.resetflix.repository.TemporadasRepository;
import br.com.cwi.resetflix.request.CriarDiretorRequest;
import br.com.cwi.resetflix.request.CriarTemporadaRequest;
import br.com.cwi.resetflix.response.ConsultarDetalhesDiretorResponse;
import br.com.cwi.resetflix.response.ConsultarDetalhesTemporadaResponse;
import br.com.cwi.resetflix.response.DiretoresResponse;
import br.com.cwi.resetflix.response.TemporadasResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TemporadasService {


    @Autowired
    private TemporadasRepository temporadasRepository;

    @Autowired
    private SeriesRepository serieRepository;

    static TemporadasResponseMapper MAPPER_RESPONSE = new TemporadasResponseMapper();
    static TemporadaEntityMapper MAPPER_ENTITY = new TemporadaEntityMapper();
    static ConsultarDetalhesTemporadaResponseMapper MAPPER_DETALHES_TEMPORADA = new ConsultarDetalhesTemporadaResponseMapper();

    public List<TemporadasResponse> getTemporadas() {
        final List<TemporadaEntity> temporadas = temporadasRepository.getTemporadas();
        return MAPPER_RESPONSE.mapear(temporadas);
    }

    public Long criarTemporada(final CriarTemporadaRequest request) {
        TemporadaEntity temporadaSalvar = MAPPER_ENTITY.mapear(request);
        return temporadasRepository.criarTemporada(temporadaSalvar);
    }

    public ConsultarDetalhesTemporadaResponse consultarDetalhesTemporada(final Long id) {
        TemporadaEntity temporadaSalvo = temporadasRepository.acharTemporadaPorId(id);
        List<SerieEntity> seriesTemporada = serieRepository.acharSeriesTemporada(id);
        return MAPPER_DETALHES_TEMPORADA.mapear(temporadaSalvo, seriesTemporada);
    }

}
