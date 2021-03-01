package br.com.cwi.resetflix.web;

import br.com.cwi.resetflix.domain.Genero;
import br.com.cwi.resetflix.request.CriarSerieRequest;
import br.com.cwi.resetflix.response.ConsultarDetalhesSerieResponse;
import br.com.cwi.resetflix.response.SerieResponse;
import br.com.cwi.resetflix.service.SeriesService;
import br.com.cwi.resetflix.service.UsuarioService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/series")
public class SeriesController implements SeriesContract {


    @Autowired
    private SeriesService seriesService;

    @Autowired
    private UsuarioService usuarioService;

    @Override
    @GetMapping("/{id}")
    public ConsultarDetalhesSerieResponse getSerieById(@PathVariable("id") final Long id) {
        return seriesService.consultarDetalhes(id);
    }

    @Override
    @PostMapping
    public Long criarSerie(@RequestBody final CriarSerieRequest request) {
        return seriesService.criarSerie(request);
    }

    @Override
    @GetMapping
    public List<SerieResponse> getSeries(@RequestParam(name = "genero", value = "genero",
            required = false) Genero genero) {
        return seriesService.getSeries(genero);
    }

    @Override
    @PostMapping("/series/{id}/{temporada}/{episodio}/assistir")
    public void assistirSerie(@PathVariable("id") Long id, Integer temporada, Integer episodio) {
        usuarioService.assistir(id);

    }

    @GetMapping("/recomendacoes")
    public List<SerieResponse> getRecomendacoesSeries() {
        return usuarioService.getRecomendacao();
    }


}


