package br.com.cwi.resetflix.service;

import br.com.cwi.resetflix.domain.Genero;
import br.com.cwi.resetflix.entity.AtorEntity;
import br.com.cwi.resetflix.entity.DiretorEntity;
import br.com.cwi.resetflix.entity.FilmeEntity;
import br.com.cwi.resetflix.mapper.ConsultarDetalhesFilmeResponseMapper;
import br.com.cwi.resetflix.mapper.FilmeEntityMapper;
import br.com.cwi.resetflix.mapper.FilmeResponseMapper;
import br.com.cwi.resetflix.repository.AtoresRepository;
import br.com.cwi.resetflix.repository.DiretoresRepository;
import br.com.cwi.resetflix.repository.FilmeRepository;
import br.com.cwi.resetflix.request.CriarFilmeRequest;
import br.com.cwi.resetflix.response.ConsultarDetalhesFilmeResponse;
import br.com.cwi.resetflix.response.FilmeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FilmesService {

    @Autowired
    private FilmeRepository filmeRepository;

    @Autowired
    private DiretoresRepository diretoresRepository;

    @Autowired
    private AtoresRepository atoresRepository;

    static FilmeResponseMapper MAPPER_RESPONSE = new FilmeResponseMapper();
    static FilmeEntityMapper MAPPER_ENTITY = new FilmeEntityMapper();
    static ConsultarDetalhesFilmeResponseMapper MAPPER_DETALHES = new ConsultarDetalhesFilmeResponseMapper();

    public List<FilmeResponse> getFilmes(Genero genero) {
        List<FilmeEntity> filmeEntities = filmeRepository.getFilmes();
        List<FilmeEntity> filtrados = new ArrayList<FilmeEntity>();
        if (genero != null) {
            for (FilmeEntity filmeEntity : filmeEntities) {
                if (filmeEntity.getGenero().equals(genero)) {
                    filtrados.add(filmeEntity);
                }
            }
            return MAPPER_RESPONSE.mapear(filtrados);
        } else {
            return MAPPER_RESPONSE.mapear(filmeEntities);
        }
    }


    public Long criarFilme(CriarFilmeRequest request) {
        return filmeRepository.criarFilme(MAPPER_ENTITY.mapear(request));
    }

    public ConsultarDetalhesFilmeResponse consultarDetalhes(Long id) {
        FilmeEntity filmeEntity = filmeRepository.acharFilme(id);
        DiretorEntity diretorEntity = diretoresRepository.acharDiretorPorId(filmeEntity.getIdDiretor());
        List<AtorEntity> atorEntities = new ArrayList<AtorEntity>();

        for (Long idAtor : filmeEntity.getIdsAtores()) {
            AtorEntity atorEntity = atoresRepository.acharAtorPorId(idAtor);
            atorEntities.add(atorEntity);
        }

        return MAPPER_DETALHES.mapear(filmeEntity, diretorEntity, atorEntities);

    }
}
