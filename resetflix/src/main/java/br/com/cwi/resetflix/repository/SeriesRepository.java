package br.com.cwi.resetflix.repository;

import br.com.cwi.resetflix.domain.Genero;
import br.com.cwi.resetflix.entity.SerieEntity;
import br.com.cwi.resetflix.exception.NotFoundException;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;

import static java.util.Arrays.asList;

@Repository
public class SeriesRepository {

    static List<SerieEntity> series = Collections.singletonList(
            new SerieEntity("Big Bang Theory", Genero.COMEDIA, 1l,
                    1l, asList(1l))
    );

    static Long contadorIds = 1l;

    public List<SerieEntity> getSeries() {
        return series;
    }

    public List<SerieEntity> acharSeriesEpisodios(final Long id) {
        //TODO Filtrar na repository por id de ator
        return series;
    }

    public List<SerieEntity> acharSeriesTemporadas(Long id) { //eu fiz esse
        //TODO Filtrar na repository por id de diretor
        return series;
    }


    public Long criarSerie(SerieEntity serieEntity) {
        if (serieEntity.getId() == null) {
            contadorIds++;
            serieEntity.setId(contadorIds);
        }
        series.add(serieEntity);
        return serieEntity.getId();
    }

    public SerieEntity acharSerie(Long id) {
        for (SerieEntity serieEntity : series) {
            if (serieEntity.getId().equals(id)) {
                return serieEntity;
            }
        }
        throw new NotFoundException("Serie " + id + " não encontrado.");

    }
}
