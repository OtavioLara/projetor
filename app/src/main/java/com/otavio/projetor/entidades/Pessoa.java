package com.otavio.projetor.entidades;

/**
 * Created by Otavio on 06/02/2017.
 */

public abstract class Pessoa {
    private String nome;
    private String email; //Primary Key

    public Pessoa(String nome, String email){

    }

    public String getEmail() {
        return email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pessoa)) return false;

        Pessoa pessoa = (Pessoa) o;

        return email != null ? email.equals(pessoa.email) : pessoa.email == null;

    }

    @Override
    public int hashCode() {
        return email != null ? email.hashCode() : 0;
    }

}
