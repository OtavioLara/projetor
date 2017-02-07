package com.otavio.projetor.repositorio;

import com.otavio.projetor.entidades.Projetor;

import java.util.HashMap;

/**
 * Created by Otavio on 06/02/2017.
 */
public class RepositorioProjetorMemoria implements RepositorioProjetor {
    private HashMap<Long,Projetor> projetores;

    private static RepositorioProjetorMemoria ourInstance = new RepositorioProjetorMemoria();
    public static RepositorioProjetorMemoria getInstance() {
        return ourInstance;
    }
    private RepositorioProjetorMemoria() {
        projetores = new HashMap<>();
    }
    @Override
    public boolean adicionarProjetor(Projetor projetor) {
        if(projetores.containsKey(projetor.getNumPatrimonio())){
            projetores.put(projetor.getNumPatrimonio(),projetor);
            return true;
        }
        return false;
    }

    @Override
    public boolean removerProjetor(long id) {
        return false;
    }

    @Override
    public boolean alterarProjetor(Projetor novoProjetor, int idAntigoProjetor) {
        return false;
    }

    @Override
    public Projetor buscarProjetor(long numeroPatrimonio) {
        return projetores.get(numeroPatrimonio);
    }
}
