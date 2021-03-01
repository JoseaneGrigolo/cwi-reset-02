package br.com.cwi.resetflix.mapper;

import br.com.cwi.resetflix.entity.SerieEntity;
import br.com.cwi.resetflix.response.SerieResponse;

import java.util.ArrayList;
import java.util.List;

public class SerieResponseMapper {

    public List<SerieResponse> mapear(final List<SerieEntity> seriesEpisodios) {
        List<SerieResponse> responses = new ArrayList<>();

        for (SerieEntity serieEntity : seriesEpisodios) {
            responses.add(new SerieResponse(serieEntity.getId()
                    , serieEntity.getNome()
                    , serieEntity.getGenero()));
        }

        return responses;
    }
}
