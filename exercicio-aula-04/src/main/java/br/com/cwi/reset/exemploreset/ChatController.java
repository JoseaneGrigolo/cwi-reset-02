package br.com.cwi.reset.exemploreset;

import br.com.cwi.reset.exemploreset.domain.Mensagem;
import br.com.cwi.reset.exemploreset.service.MensagemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequestMapping("/chat")
@RestController
public class ChatController {

    @Autowired
    private MensagemService mensagemService;

    @GetMapping
    public List<Mensagem> obterMensagens() {
        return mensagemService.obterMensagens();
    }
    @PostMapping
    public Mensagem criarMensagem(@RequestBody Mensagem mensagem){
        return mensagemService.criarMensagem(mensagem);
    }

}

