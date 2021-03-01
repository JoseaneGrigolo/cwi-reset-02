package br.com.cwi.resetflix.mapper;

import br.com.cwi.resetflix.entity.DiretorEntity;
import br.com.cwi.resetflix.entity.FilmeEntity;
import br.com.cwi.resetflix.entity.SerieEntity;
import br.com.cwi.resetflix.entity.TemporadaEntity;
import br.com.cwi.resetflix.response.ConsultarDetalhesDiretorResponse;
import br.com.cwi.resetflix.response.ConsultarDetalhesTemporadaResponse;
import br.com.cwi.resetflix.response.FilmeResponse;
import br.com.cwi.resetflix.response.SerieResponse;

import java.util.List;

public class ConsultarDetalhesTemporadaResponseMapper {

    public ConsultarDetalhesTemporadaResponse mapear(final TemporadaEntity temporadaSalvo, final List<SerieEntity> seriesTemporada) {
        List<SerieResponse> seriesResponse = new SerieResponseMapper().mapear(seriesTemporada);
        return new ConsultarDetalhesTemporadaResponse(temporadaSalvo.getId(),
                temporadaSalvo.getNome(), seriesResponse);
    }
}
