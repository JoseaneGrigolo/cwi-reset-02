package br.com.cwi.reset.exemploreset.repository;

import br.com.cwi.reset.exemploreset.domain.Mensagem;
import br.com.cwi.reset.exemploreset.domain.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class UsuarioRepository {

    static List<Usuario> usuarios = new ArrayList<>();

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public Usuario addUsuario(Usuario usuario) {
        //usuario.setId(new Long(usuarios.size() + 1)
        usuarios.add(usuario);
        return usuario;
    }

    //public void deletarUsuario(final Long id) {
    //Usuario deletar = null;
    //        for(Usuario usuario: usuarios){
    //            if(usuario.getId()equals(id)){
    //                   deletar = usuario;
    //}
   //}
    //                usuarios.remove(usuario);

}


