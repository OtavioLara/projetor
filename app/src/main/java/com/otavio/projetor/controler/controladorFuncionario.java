package com.otavio.projetor.controler;

import com.otavio.projetor.entidades.Funcionario;
import com.otavio.projetor.repositorio.RepositorioFuncionarioMemoria;

/**
 * Created by Otavio on 20/02/2017.
 */

public class controladorFuncionario {
    private static RepositorioFuncionarioMemoria repoFunc = RepositorioFuncionarioMemoria.getInstance();

    public static boolean adicionarFuncionario(String nome, String email, String senha){
        return repoFunc.adicionarFuncionario(new Funcionario(nome,email,senha));
    }
    public static boolean removerFuncionario(String email){
        return repoFunc.removerFuncionario(email);
    }
    public static boolean aterarFuncionario(String novoNome, String novoEmail, String novaSenha, String email){
        return repoFunc.alterarFuncionario(new Funcionario(novoNome,novoEmail,novaSenha),email);
    }
    public static Funcionario buscarFuncionario(String email){
        return repoFunc.buscarFuncionario(email);
    }
    public static boolean logarPessoa(String email, String senha) {
        return repoFunc.logarPessoa(email, senha);
    }
}
