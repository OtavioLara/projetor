package com.otavio.projetor.controler;

import com.otavio.projetor.entidades.Projetor;
import com.otavio.projetor.repositorio.RepositorioProjetor;
import com.otavio.projetor.repositorio.RepositorioProjetorMemoria;

/**
 * Created by Otavio on 20/02/2017.
 */

public class controladorProjetor {
    private static RepositorioProjetor repoProj = RepositorioProjetorMemoria.getInstance();

    public static boolean adicionarProjetor(String apelido, long numPatrimonio){
        return repoProj.adicionarProjetor(new Projetor(apelido,numPatrimonio));
    }
    public static boolean removerProjetor(long numPatrimonio){
        return repoProj.removerProjetor(numPatrimonio);
    }
    public static boolean alterarProjetor(String apelido, long numPatrimonio, long numPatrimonioAntigo){
        return repoProj.alterarProjetor(new Projetor(apelido,numPatrimonio), numPatrimonioAntigo);
    }
    public static Projetor buscarProjetor(long numPatrimonio){
        return repoProj.buscarProjetor(numPatrimonio);
    }
}
