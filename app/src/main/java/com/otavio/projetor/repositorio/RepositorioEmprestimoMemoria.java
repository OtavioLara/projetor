package com.otavio.projetor.repositorio;

import com.otavio.projetor.entidades.Emprestimo;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Otavio on 06/02/2017.
 */
public class RepositorioEmprestimoMemoria implements RepositorioEmprestimo {
    private HashMap<Integer,Emprestimo> emprestimos;

    private static RepositorioEmprestimoMemoria ourInstance = new RepositorioEmprestimoMemoria();
    public static RepositorioEmprestimoMemoria getInstance() {
        return ourInstance;
    }
    private RepositorioEmprestimoMemoria() {

    }

    @Override
    public boolean adicionarEmprestimo(Emprestimo emprestimo) {
        if (!emprestimos.containsKey(emprestimo.getId())){

        }
        return false;
    }

    @Override
    public boolean removerEmprestimo(int id) {
        return false;
    }

    @Override
    public boolean alterarEmprestimo(Emprestimo novoEmprestimo, int idAntigoEmprestimo) {
        return false;
    }

    @Override
    public boolean buscarEmprestimo(int id) {
        return false;
    }
}
