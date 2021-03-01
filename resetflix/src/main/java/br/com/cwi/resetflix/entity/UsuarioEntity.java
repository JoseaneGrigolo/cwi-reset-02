package br.com.cwi.resetflix.entity;

import java.util.ArrayList;
import java.util.List;

public class UsuarioEntity {

    private Long id;
    private String nome;
    private List<Long> idsAssistidos = new ArrayList<Long>();

    public UsuarioEntity(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public List<Long> getIdsAssistidos() {
        return idsAssistidos;
    }

    public void assistir(Long id){
        this.idsAssistidos.add(id);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
