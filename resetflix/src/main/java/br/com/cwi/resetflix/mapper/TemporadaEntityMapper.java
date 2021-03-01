package br.com.cwi.resetflix.mapper;

import br.com.cwi.resetflix.entity.TemporadaEntity;
import br.com.cwi.resetflix.request.CriarTemporadaRequest;

public class TemporadaEntityMapper {
    public TemporadaEntity mapear(final CriarTemporadaRequest request) {
        return new TemporadaEntity(request.getNome(), request.getIdSeries());
    }
}
