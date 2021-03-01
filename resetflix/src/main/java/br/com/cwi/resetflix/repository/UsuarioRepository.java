package br.com.cwi.resetflix.repository;

import br.com.cwi.resetflix.entity.UsuarioEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UsuarioRepository {

    static UsuarioEntity usuario = new UsuarioEntity(1L, "Joseane");

    public void assistir(Long id) {
        this.usuario.assistir(id);
    }

    public List<Long> getAssistidos() {
        return this.usuario.getIdsAssistidos();
    }
}
