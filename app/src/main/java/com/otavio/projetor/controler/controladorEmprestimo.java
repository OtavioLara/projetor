package com.otavio.projetor.controler;

import com.otavio.projetor.entidades.Emprestimo;
import com.otavio.projetor.entidades.Funcionario;
import com.otavio.projetor.entidades.PessoaLogada;
import com.otavio.projetor.repositorio.RepositorioEmprestimoMemoria;
import com.otavio.projetor.repositorio.RepositorioProjetorMemoria;
import com.otavio.projetor.repositorio.RepositorioUsuarioMemoria;

import java.util.Date;

/**
 * Created by Otavio on 06/02/2017.
 */

public class controladorEmprestimo {
    private static RepositorioProjetorMemoria repoProj = RepositorioProjetorMemoria.getInstance();
    private static RepositorioUsuarioMemoria repoUsu = RepositorioUsuarioMemoria.getInstance();
    public static boolean criarEmprestimo(Date data, int duracao, long numeroPatrimonio,String emailUsuario,boolean isEmprestimoRealizado){
        return RepositorioEmprestimoMemoria.getInstance().adicionarEmprestimo(
                new Emprestimo(data,duracao,repoProj.buscarProjetor(numeroPatrimonio),
                        (Funcionario)PessoaLogada.getInstance().getPessoaLogada(), repoUsu.buscarUsuario(emailUsuario),isEmprestimoRealizado));
    }
    public static void removerEmprestimo(int id){

    }
}
