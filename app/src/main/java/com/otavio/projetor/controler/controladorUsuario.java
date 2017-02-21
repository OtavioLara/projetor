package com.otavio.projetor.controler;

import com.otavio.projetor.entidades.Usuario;
import com.otavio.projetor.repositorio.RepositorioUsuario;
import com.otavio.projetor.repositorio.RepositorioUsuarioMemoria;

/**
 * Created by Otavio on 20/02/2017.
 */

public class controladorUsuario {
    private static RepositorioUsuario repoUsuario = RepositorioUsuarioMemoria.getInstance();
    public static boolean adicionarUsuario(String nome, String email,String departamento){
        return repoUsuario.adicionarUsuario(new Usuario(nome,email,departamento));
    }
    public static boolean removerUsuario(String email){
        return repoUsuario.removerUsuario(email);
    }
    public static boolean alterarUsuario(String nome, String email, String departamento, String emailAntigo){
        return repoUsuario.alterarUsuario(new Usuario(nome,email,departamento),emailAntigo);
    }
    public static Usuario buscarUsuario(String email){
        return repoUsuario.buscarUsuario(email);
    }
}
