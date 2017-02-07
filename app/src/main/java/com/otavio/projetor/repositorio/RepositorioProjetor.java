package com.otavio.projetor.repositorio;

import com.otavio.projetor.entidades.Projetor;

/**
 * Created by Otavio on 06/02/2017.
 */

public interface RepositorioProjetor {
    public boolean adicionarProjetor(Projetor projetor);
    public boolean removerProjetor(long numeroPatrimonio);
    public boolean alterarProjetor(Projetor novoProjetor, int numeroPatrimonioAntigo);
    public Projetor buscarProjetor(long numeroPatrimonio);
}
