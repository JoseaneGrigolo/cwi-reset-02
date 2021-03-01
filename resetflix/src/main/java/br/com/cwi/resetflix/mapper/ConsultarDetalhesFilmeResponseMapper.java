package br.com.cwi.resetflix.mapper;

import br.com.cwi.resetflix.entity.AtorEntity;
import br.com.cwi.resetflix.entity.DiretorEntity;
import br.com.cwi.resetflix.entity.FilmeEntity;
import br.com.cwi.resetflix.response.ConsultarDetalhesFilmeResponse;

import java.util.List;

public class ConsultarDetalhesFilmeResponseMapper {

    static DiretoresResponseMapper MAPPER_DIRETOR = new DiretoresResponseMapper();
    static AtoresResponseMapper MAPPER_ATOR = new AtoresResponseMapper();

    public ConsultarDetalhesFilmeResponse mapear(FilmeEntity filmeEntity
            , DiretorEntity diretorEntity
            , List<AtorEntity> atorEntities) {
        return new ConsultarDetalhesFilmeResponse(filmeEntity.getId()
                , filmeEntity.getNome()
                , filmeEntity.getGenero()
                , MAPPER_DIRETOR.mapear(diretorEntity)
                , MAPPER_ATOR.mapear(atorEntities));
    }

}
