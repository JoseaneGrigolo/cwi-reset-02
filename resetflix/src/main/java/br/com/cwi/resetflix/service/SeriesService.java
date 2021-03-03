package br.com.cwi.resetflix.service;

import br.com.cwi.resetflix.domain.Genero;
import br.com.cwi.resetflix.entity.AtorEntity;
import br.com.cwi.resetflix.entity.SerieEntity;
import br.com.cwi.resetflix.mapper.ConsultarDetalhesSerieResponseMapper;
import br.com.cwi.resetflix.mapper.SerieEntityMapper;
import br.com.cwi.resetflix.mapper.SerieResponseMapper;
import br.com.cwi.resetflix.repository.AtoresRepository;
import br.com.cwi.resetflix.repository.SeriesRepository;
import br.com.cwi.resetflix.request.CriarSerieRequest;
import br.com.cwi.resetflix.response.ConsultarDetalhesSerieResponse;
import br.com.cwi.resetflix.response.SerieResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SeriesService {

    @Autowired
    private SeriesRepository serieRepository;

    @Autowired
    private AtoresRepository atoresRepository;

    static SerieResponseMapper MAPPER_RESPONSE = new SerieResponseMapper();
    static SerieEntityMapper MAPPER_ENTITY = new SerieEntityMapper();
    static ConsultarDetalhesSerieResponseMapper MAPPER_DETALHES = new ConsultarDetalhesSerieResponseMapper();

    public List<SerieResponse> getSeries(Genero genero) {
        List<SerieEntity> serieEntities = serieRepository.getSeries();
        List<SerieEntity> filtrados = new ArrayList<SerieEntity>();
        if (genero != null) {
            for (SerieEntity serieEntity : serieEntities) {
                if (serieEntity.getGenero().equals(genero)) {
                    filtrados.add(serieEntity);
                }
            }
            return MAPPER_RESPONSE.mapear(filtrados);
        } else {
            return MAPPER_RESPONSE.mapear(serieEntities);
        }
    }

    public Long criarSerie(CriarSerieRequest request) {
        return serieRepository.criarSerie(MAPPER_ENTITY.mapear(request));
    }

    public ConsultarDetalhesSerieResponse consultarDetalhes(Long id) {
        SerieEntity serieEntity = serieRepository.acharSerie(id);
        List<AtorEntity> atorEntities = new ArrayList<AtorEntity>();

        for (Long idAtor : serieEntity.getIdsAtores()) {
            AtorEntity atorEntity = atoresRepository.acharAtorPorId(idAtor);
            atorEntities.add(atorEntity);
        }

        return MAPPER_DETALHES.mapear(serieEntity, atorEntities);

    }
}
