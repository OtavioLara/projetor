package com.otavio.projetor.controler;

import com.otavio.projetor.entidades.Emprestimo;
import com.otavio.projetor.entidades.Funcionario;
import com.otavio.projetor.entidades.PessoaLogada;
import com.otavio.projetor.repositorio.RepositorioEmprestimo;
import com.otavio.projetor.repositorio.RepositorioEmprestimoMemoria;

import java.util.Date;

/**
 * Created by Otavio on 06/02/2017.
 */

public class controladorEmprestimo {
    private static RepositorioEmprestimo repoEmp = RepositorioEmprestimoMemoria.getInstance();

    public static boolean criarEmprestimo(Date data, int duracao, long numeroPatrimonio,String emailUsuario,boolean isEmprestimoRealizado){
        return repoEmp.adicionarEmprestimo(
                new Emprestimo(data,duracao,controladorProjetor.buscarProjetor(numeroPatrimonio),
                        (Funcionario)PessoaLogada.getInstance().getPessoaLogada(), controladorUsuario.buscarUsuario(emailUsuario),isEmprestimoRealizado));
    }
    public static boolean removerEmprestimo(int id){
        return repoEmp.removerEmprestimo(id);
    }
    public static boolean alterarEmprestimo(Date data, int duracao, long numeroPatrimonio,String emailUsuario,boolean isEmprestimoRealizado ,int idAntigoEmprestimo){
        return repoEmp.alterarEmprestimo(new Emprestimo(data,duracao,controladorProjetor.buscarProjetor(numeroPatrimonio),
                (Funcionario)PessoaLogada.getInstance().getPessoaLogada(), controladorUsuario.buscarUsuario(emailUsuario),isEmprestimoRealizado), idAntigoEmprestimo);
    }
    public static Emprestimo buscarEmprestimo(int id){
        return repoEmp.buscarEmprestimo(id);
    }
}
