package br.com.cwi.resetflix.repository;

import br.com.cwi.resetflix.domain.Genero;
import br.com.cwi.resetflix.entity.FilmeEntity;
import br.com.cwi.resetflix.exception.NotFoundException;
import br.com.cwi.resetflix.response.ConsultarDetalhesFilmeResponse;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;

import static java.util.Arrays.asList;

@Repository
public class FilmeRepository {

    static List<FilmeEntity> filmes = Collections.singletonList(
            new FilmeEntity(1l, "Interestelar", Genero.ACAO,
                    1l, asList(1l))
    );

    static Long contadorIds = 1l;

    public List<FilmeEntity> getFilmes() {
        return filmes;
    }

    public List<FilmeEntity> acharFilmesAtor(final Long id) {
        //TODO Filtrar na repository por id de ator
        return filmes;
    }

    public List<FilmeEntity> acharFilmesDiretor(Long id) { //eu fiz esse
        //TODO Filtrar na repository por id de diretor
        return filmes;
    }


    public Long criarFilme(FilmeEntity filmeEntity) {
        if (filmeEntity.getId() == null) {
            contadorIds++;
            filmeEntity.setId(contadorIds);
        }
        filmes.add(filmeEntity);
        return filmeEntity.getId();
    }

    public FilmeEntity acharFilme(Long id) {
        for(FilmeEntity filmeEntity : filmes){
            if(filmeEntity.getId().equals(id)){
                return filmeEntity;
            }
        }
        throw new NotFoundException("Filme " + id + " não encontrado.");

    }
}
