package br.com.cwi.resetflix.mapper;

import br.com.cwi.resetflix.entity.AtorEntity;
import br.com.cwi.resetflix.entity.EpisodioEntity;
import br.com.cwi.resetflix.request.CriarAtorRequest;
import br.com.cwi.resetflix.request.CriarEpisodioRequest;

public class EpisodioEntityMapper {

    public EpisodioEntity mapear(final CriarEpisodioRequest request) {
        return new EpisodioEntity(request.getNome(), request.getIdSeries());
    }

}

