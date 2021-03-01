package br.com.cwi.resetflix.mapper;

import br.com.cwi.resetflix.entity.EpisodioEntity;
import br.com.cwi.resetflix.entity.SerieEntity;
import br.com.cwi.resetflix.response.ConsultarDetalhesAtorResponse;
import br.com.cwi.resetflix.response.ConsultarDetalhesEpisodioResponse;
import br.com.cwi.resetflix.response.SerieResponse;

import java.util.List;

public class ConsultarDetalhesEpisodioResponseMapper {

    public ConsultarDetalhesEpisodioResponse mapear(final EpisodioEntity episodioSalvo, final List<SerieEntity> seriesEpisodio) {
        List<SerieResponse> seriesResponse = new SerieResponseMapper().mapear(seriesEpisodio);
        return new ConsultarDetalhesAtorResponse(episodioSalvo.getId(),
                episodioSalvo.getNome(), seriesResponse);
    }
}
