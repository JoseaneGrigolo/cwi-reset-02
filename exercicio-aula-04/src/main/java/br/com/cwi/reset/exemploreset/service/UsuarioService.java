package br.com.cwi.reset.exemploreset.service;

import br.com.cwi.reset.exemploreset.domain.Mensagem;
import br.com.cwi.reset.exemploreset.domain.Usuario;
import br.com.cwi.reset.exemploreset.exception.BadRequestException;
import br.com.cwi.reset.exemploreset.repository.MensagemRepository;
import br.com.cwi.reset.exemploreset.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    private static long nextId = 0;
    @Autowired
    private UsuarioRepository repository;

    public List<Usuario> obterUsuarios() {
        return repository.getUsuarios();

    }

    public Usuario criarUsuario(Usuario usuario) {
        //aqui so igualou ususario a null e id != de null
        if(usuario == null || usuario.getNome() == null || usuario.getSenha() == null|| usuario.getEmail() == null) {
            throw new BadRequestException();
        }
        //nao fez assim
        this.nextId++;
        usuario.setId(nextId);
        return repository.addUsuario(usuario);

    }

    //criou no repository
    public void deleteUsuario(long id) {
        List<Usuario> usuarios = repository.getUsuarios();
        for(Usuario usuario: usuarios){
            if(usuario.getId() == id){
                usuarios.remove(usuario);
            }
        }
    }

}