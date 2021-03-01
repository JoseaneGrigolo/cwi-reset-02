package br.com.cwi.resetflix.repository;

import br.com.cwi.resetflix.entity.DiretorEntity;
import br.com.cwi.resetflix.entity.TemporadaEntity;

import java.util.ArrayList;
import java.util.List;

public class TemporadasRepository {

    static List<TemporadaEntity> temporadas = new ArrayList<>();
    static Long contadorIds = 1l;

    public List<TemporadaEntity> getTemporadas(){
        return temporadas;
    }

    public Long criarTemporada(final TemporadaEntity temporadaSalvar) {
        if(temporadaSalvar.getId() == null){
            temporadaSalvar.setId(contadorIds);
            contadorIds++;
        }

        temporadas.add(temporadaSalvar);

        return temporadaSalvar.getId();
    }

    public TemporadaEntity acharTemporadaPorId(final Long id) {

        for(TemporadaEntity temporadaEntity : temporadas){
            if(temporadaEntity.getId().equals(id)){
                return temporadaEntity;
            }
        }

        return null;
    }
}
