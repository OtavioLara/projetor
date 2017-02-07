package com.otavio.projetor.repositorio;

import com.otavio.projetor.entidades.Funcionario;

import java.util.HashMap;

/**
 * Created by Otavio on 06/02/2017.
 */
public class RepositorioFuncionarioMemoria implements RepositorioFuncionario {
    private HashMap<String,Funcionario> funcionarios;
    private static RepositorioFuncionarioMemoria ourInstance = new RepositorioFuncionarioMemoria();

    public static RepositorioFuncionarioMemoria getInstance() {
        return ourInstance;
    }

    private RepositorioFuncionarioMemoria() {
        funcionarios = new HashMap<>();
    }

    @Override
    public boolean adicionarFuncionario(Funcionario funcionario) {
        if(!funcionarios.containsValue(funcionario)){
            funcionarios.put(funcionario.getEmail(),funcionario);
        }
        return false;
    }

    @Override
    public boolean removerFuncionario(String email) {
        return false;
    }

    @Override
    public boolean alterarFuncionario(Funcionario novoFuncionario, String email) {
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
    public Funcionario getFuncionarioPorEmail(String email){
        return funcionarios.get(email);
    }
}