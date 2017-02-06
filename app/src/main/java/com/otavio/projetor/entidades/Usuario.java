package com.otavio.projetor.entidades;

/**
 * Created by Otavio on 06/02/2017.
 */

public class Usuario extends Pessoa {
    private String departamento;

    public Usuario(String nome, String email, String departamento) {
        super(nome, email);
        this.departamento = departamento;
    }
}
