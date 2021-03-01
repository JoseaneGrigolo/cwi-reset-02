package br.com.cwi.resetflix.mapper;

import br.com.cwi.resetflix.entity.DiretorEntity;
import br.com.cwi.resetflix.entity.TemporadaEntity;
import br.com.cwi.resetflix.response.DiretoresResponse;
import br.com.cwi.resetflix.response.TemporadasResponse;

import java.util.ArrayList;
import java.util.List;

public class TemporadasResponseMapper {


    public List<TemporadasResponse> mapear(final List<TemporadaEntity> temporadas) {
        List<TemporadasResponse> temporadasResponse = new ArrayList<>();

        for (TemporadaEntity temporadaEntity : temporadas) {
            TemporadasResponse temporadaResponse = mapear(temporadaEntity);
            temporadasResponse.add(temporadaResponse);
        }

        return temporadasResponse;
    }

    public TemporadasResponse mapear(TemporadaEntity temporadaEntity) {
        return new TemporadasResponse(temporadaEntity.getId()
                , temporadaEntity.getNome());
    }
}
