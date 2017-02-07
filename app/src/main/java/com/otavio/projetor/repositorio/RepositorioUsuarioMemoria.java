package com.otavio.projetor.repositorio;

import com.otavio.projetor.entidades.Usuario;

import java.util.HashMap;

/**
 * Created by Otavio on 07/02/2017.
 */
public class RepositorioUsuarioMemoria implements RepositorioUsuario {

    private HashMap<String,Usuario> usuarios;

    private static RepositorioUsuarioMemoria ourInstance = new RepositorioUsuarioMemoria();

    public static RepositorioUsuarioMemoria getInstance() {
        return ourInstance;
    }

    private RepositorioUsuarioMemoria() {
        usuarios = new HashMap<>();
    }

    @Override
    public boolean adicionarUsuario(Usuario usuario) {
        return false;
    }

    @Override
    public boolean removerUsuario(String email) {
        return false;
    }

    @Override
    public boolean alterarUsuario(Usuario novoUsuario, String email) {
        return false;
    }

    @Override
    public Usuario buscarUsuario(String email) {
        return usuarios.get(email);
    }
}
