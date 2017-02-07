package com.otavio.projetor.repositorio;

import com.otavio.projetor.entidades.Usuario;

/**
 * Created by Otavio on 06/02/2017.
 */

public interface RepositorioUsuario {
    public boolean adicionarUsuario(Usuario usuario);
    public boolean removerUsuario(String email);
    public boolean alterarUsuario (Usuario novoUsuario,String email);
    public Usuario buscarUsuario(String email);
}
