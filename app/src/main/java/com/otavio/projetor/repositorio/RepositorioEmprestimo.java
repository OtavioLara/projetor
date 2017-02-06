package com.otavio.projetor.repositorio;

import com.otavio.projetor.entidades.Emprestimo;

/**
 * Created by Otavio on 06/02/2017.
 */

public interface RepositorioEmprestimo {
    public boolean adicionarEmprestimo(Emprestimo emprestimo);
    public boolean removerEmprestimo(int id);
    public boolean alterarEmprestimo(Emprestimo novoEmprestimo, int idAntigoEmprestimo);
    public boolean buscarEmprestimo(int id);
}
