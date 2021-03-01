package br.com.cwi.resetflix.mapper;

import br.com.cwi.resetflix.entity.AtorEntity;
import br.com.cwi.resetflix.entity.EpisodioEntity;
import br.com.cwi.resetflix.response.AtoresResponse;
import br.com.cwi.resetflix.response.EpisodiosResponse;

import java.util.ArrayList;
import java.util.List;

public class EpisodiosResponseMapper {


    public List<EpisodiosResponse> mapear(final List<EpisodioEntity> episodios) {
        List<EpisodiosResponse> episodiosResponses = new ArrayList<>();

        for(EpisodioEntity episodiosEntity : episodios){

            EpisodiosResponse episodioResponse = new EpisodiosResponse(episodiosEntity.getId(),
                    episodiosEntity.getNome());

            episodiosResponses.add(episodioResponse);
        }

        return episodiosResponses;
    }
}
