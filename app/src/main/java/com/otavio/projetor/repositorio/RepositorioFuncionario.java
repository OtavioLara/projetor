package com.otavio.projetor.repositorio;
import com.otavio.projetor.entidades.Funcionario;

/**
 * Created by Otavio on 06/02/2017.
 */

public interface RepositorioFuncionario {
    public boolean adicionarFuncionario(Funcionario funcionario);
    public boolean removerFuncionario(int id);
    public boolean alterarFuncionario (Funcionario novoFuncionario,int id);
    public Funcionario buscarFuncionario(String email);
    public boolean logarPessoa(String email,String senha);
}
