package com.otavio.projetor.entidades;

/**
 * Created by Otavio on 06/02/2017.
 */
public class PessoaLogada {
    private static PessoaLogada ourInstance = new PessoaLogada();
    public static PessoaLogada getInstance() {
        return ourInstance;
    }
    private Pessoa pessoaLogada;
    private void setPessoaLogada(Pessoa novaPessoa){
        pessoaLogada = novaPessoa;
    }
    private Pessoa getPessoaLogada(){
        return pessoaLogada;
    }
    private PessoaLogada() {

    }
}