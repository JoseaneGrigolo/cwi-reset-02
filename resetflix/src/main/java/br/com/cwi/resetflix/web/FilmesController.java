package br.com.cwi.resetflix.web;

import br.com.cwi.resetflix.domain.Genero;
import br.com.cwi.resetflix.request.CriarFilmeRequest;
import br.com.cwi.resetflix.response.ConsultarDetalhesFilmeResponse;
import br.com.cwi.resetflix.response.FilmeResponse;
import br.com.cwi.resetflix.service.FilmesService;
import br.com.cwi.resetflix.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/filmes")
public class FilmesController implements FilmesContract {

    @Autowired
    private FilmesService filmeService;

    @Autowired
    private UsuarioService usuarioService;

    @Override
    @GetMapping
    public List<FilmeResponse> getFilmes(@RequestParam(value = "genero", required = false) final Genero genero) {
        return filmeService.getFilmes(genero);
    }

    @Override
    @GetMapping("/{id}")
    public ConsultarDetalhesFilmeResponse getFilmeById(@PathVariable("id") final Long id) {
        return filmeService.consultarDetalhes(id);
    }

    @Override
    @PostMapping
    public Long criarFilme(@RequestBody final CriarFilmeRequest request) {
        return filmeService.criarFilme(request);
    }

    @Override
    @GetMapping("/recomendacoes")
    public List<FilmeResponse> getRecomendacoesFilmes() {
        return usuarioService.getRecomendacoes();
    }

    @Override
    @PostMapping("/{id}/assistir")
    public void assistirFilme(@PathVariable("id") final Long id) {
        usuarioService.assistir(id);
    }
}
