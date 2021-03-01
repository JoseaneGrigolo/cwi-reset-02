package br.com.cwi.resetflix.mapper;

import br.com.cwi.resetflix.entity.FilmeEntity;
import br.com.cwi.resetflix.response.FilmeResponse;

import java.util.ArrayList;
import java.util.List;

public class FilmeResponseMapper {

    public List<FilmeResponse> mapear(final List<FilmeEntity> filmesAtor) {
        List<FilmeResponse> responses = new ArrayList<>();

        for (FilmeEntity filmeEntity : filmesAtor) {
            responses.add(new FilmeResponse(filmeEntity.getId()
                    , filmeEntity.getNome()
                    , filmeEntity.getGenero()));
        }

        return responses;
    }
}
