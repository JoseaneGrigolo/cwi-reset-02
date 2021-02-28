package br.com.cwi.reset.exemploreset;

import br.com.cwi.reset.exemploreset.domain.Mensagem;
import br.com.cwi.reset.exemploreset.domain.Usuario;
import br.com.cwi.reset.exemploreset.service.MensagemService;
import br.com.cwi.reset.exemploreset.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/usuarios")
@RestController
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public List<Usuario> obterUsuarios() {
        return usuarioService.obterUsuarios();
    }

    @PostMapping
    public Usuario criarUsuario(@RequestBody Usuario usuario) {
        return usuarioService.criarUsuario(usuario);
    }

    @DeleteMapping("/{id}")
    public void deletaUsuario(@PathVariable("id") long id) {
        usuarioService.deleteUsuario(id);

    }

}