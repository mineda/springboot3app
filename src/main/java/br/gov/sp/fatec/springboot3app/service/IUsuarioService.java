package br.gov.sp.fatec.springboot3app.service;

import java.util.List;

import br.gov.sp.fatec.springboot3app.entity.Usuario;

public interface IUsuarioService {
    
    public Usuario novoUsuario(Usuario usuario);

    public List<Usuario> buscarTodosUsuarios();

    public Usuario buscarUsuarioPorId(Long id);

}
