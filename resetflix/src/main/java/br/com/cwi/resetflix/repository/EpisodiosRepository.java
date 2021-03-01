package br.com.cwi.resetflix.repository;

import br.com.cwi.resetflix.entity.AtorEntity;
import br.com.cwi.resetflix.entity.EpisodioEntity;

import java.util.ArrayList;
import java.util.List;

public class EpisodiosRepository {

    static List<EpisodioEntity> episodios = new ArrayList<>();
    static Long contadorIds = 1l;

    public List<EpisodioEntity> getEpisodios(){
        return episodios;
    }

    public Long criarEpisodio(final EpisodioEntity episodioSalvar) {
        if(episodioSalvar.getId() == null){
            episodioSalvar.setId(contadorIds);
            contadorIds++;
        }

        episodios.add(episodioSalvar);

        return episodioSalvar.getId();
    }

    public EpisodioEntity acharEpisodioPorId(final Long id) {

        for(EpisodioEntity episodioEntity : episodios){
            if(episodioEntity.getId().equals(id)){
                return episodioEntity;
            }
        }

        return null;
    }
}
