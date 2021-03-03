package br.com.cwi.resetflix.mapper;

import br.com.cwi.resetflix.entity.AtorEntity;
import br.com.cwi.resetflix.entity.SerieEntity;
import br.com.cwi.resetflix.response.ConsultarDetalhesSerieResponse;

import java.util.List;

public class ConsultarDetalhesSerieResponseMapper {

    static AtoresResponseMapper MAPPER_ATOR = new AtoresResponseMapper();

    public ConsultarDetalhesSerieResponse mapear(SerieEntity serie, List<AtorEntity> atorEntities) {

        return new ConsultarDetalhesSerieResponse(serie.getId()
                , serie.getNome()
                , serie.getGenero()
                , serie.getQtdTemporadas()
                , serie.getQtdEpisodios()
                , MAPPER_ATOR.mapear(atorEntities));
    }
}
