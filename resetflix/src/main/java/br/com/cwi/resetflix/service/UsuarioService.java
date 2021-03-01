package br.com.cwi.resetflix.service;

import br.com.cwi.resetflix.entity.FilmeEntity;
import br.com.cwi.resetflix.entity.SerieEntity;
import br.com.cwi.resetflix.exception.UsuarioDesocupadoException;
import br.com.cwi.resetflix.mapper.FilmeResponseMapper;
import br.com.cwi.resetflix.mapper.SerieResponseMapper;
import br.com.cwi.resetflix.repository.FilmeRepository;
import br.com.cwi.resetflix.repository.SeriesRepository;
import br.com.cwi.resetflix.repository.UsuarioRepository;
import br.com.cwi.resetflix.response.FilmeResponse;
import br.com.cwi.resetflix.response.SerieResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private FilmeRepository filmeRepository;

    @Autowired
    private SeriesRepository serieRepository;

    static FilmeResponseMapper MAPPER_FILME = new FilmeResponseMapper();
    static SerieResponseMapper MAPPER_SERIE = new SerieResponseMapper();

    public void assistir(Long id){
        usuarioRepository.assistir(id);
    }

    public List<FilmeResponse> getRecomendacoes() {
        List<Long> idAssistidos = usuarioRepository.getAssistidos();
        if(idAssistidos.isEmpty()){
            throw new UsuarioDesocupadoException("Não assistiu nada!");
        }
        List<FilmeEntity> assistidos = new ArrayList<FilmeEntity>();
        for(Long id : idAssistidos){
            FilmeEntity filmeEntity = filmeRepository.acharFilme(id);
            assistidos.add(filmeEntity);
        }
        return MAPPER_FILME.mapear(assistidos);
    }

    public List<SerieResponse> getRecomendacao() {
        List<Long> idAssistidos = usuarioRepository.getAssistidos();
        if(idAssistidos.isEmpty()){
            throw new UsuarioDesocupadoException("Não assistiu nada!");
        }
        List<SerieEntity> assistidos = new ArrayList<SerieEntity>();
        for(Long id : idAssistidos){
            SerieEntity serieEntity = serieRepository.acharSerie(id);
            assistidos.add(serieEntity);
        }
        return MAPPER_SERIE.mapear(assistidos);
    }

}
