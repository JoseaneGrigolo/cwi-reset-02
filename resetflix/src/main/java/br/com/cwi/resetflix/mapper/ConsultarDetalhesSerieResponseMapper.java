package br.com.cwi.resetflix.mapper;

import br.com.cwi.resetflix.entity.SerieEntity;
import br.com.cwi.resetflix.entity.TemporadaEntity;
import br.com.cwi.resetflix.response.ConsultarDetalhesSerieResponse;
import br.com.cwi.resetflix.response.ConsultarDetalhesTemporadaResponse;
import br.com.cwi.resetflix.response.SerieResponse;

import java.util.List;

public class ConsultarDetalhesSerieResponseMapper {

    public ConsultarDetalhesSerieResponse mapear(final TemporadaEntity temporadaSalva, final List<SerieEntity> seriesTemporada) {
        List<SerieResponse> seriesResponse = new SerieResponseMapper().mapear(seriesTemporada);
        return new ConsultarDetalhesTemporadaResponse(temporadaSalva.getId()
                , temporadaSalva.getNome()
                , seriesResponse);
    }
}
