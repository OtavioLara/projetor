package com.otavio.projetor.entidades;

/**
 * Created by Otavio on 06/02/2017.
 */

public class Funcionario extends Pessoa {
    private String senha;

    public Funcionario(String nome, String email, String senha) {
        super(nome, email);
        this.senha = senha;
    }
}
