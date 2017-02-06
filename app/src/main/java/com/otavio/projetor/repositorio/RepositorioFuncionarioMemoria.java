package com.otavio.projetor.repositorio;

import com.otavio.projetor.entidades.Funcionario;

import java.util.HashMap;

/**
 * Created by Otavio on 06/02/2017.
 */

public class RepositorioFuncionarioMemoria implements RepositorioFuncionario {
    private HashMap<Integer,Funcionario> Funcionarios;
    @Override
    public boolean adicionarFuncionario(Funcionario funcionario) {
        return false;
    }

    @Override
    public boolean removerFuncionario(int id) {
        return false;
    }

    @Override
    public boolean alterarFuncionario(Funcionario novoFuncionario, int id) {
        return false;
    }

    @Override
    public Funcionario buscarFuncionario(String email) {
        return null;
    }

    @Override
    public boolean logarPessoa(String email, String senha) {
        return false;
    }
}
