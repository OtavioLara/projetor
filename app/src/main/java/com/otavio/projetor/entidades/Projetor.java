package com.otavio.projetor.entidades;

/**
 * Created by Otavio on 06/02/2017.
 */

public class Projetor {

    public static final int LIVRE = 0;
    public static final int EMPRESTADO = 1;
    public static final int MANUTENCAO = 2;

    private String apelido;
    private long numPatrimonio; // sempre 6 digitos
    private int status;//Status para verificar se o projetor já está livre ou emprestado ou em manutencao

    public Projetor(String apelido, long numPatrimonio) {
        this.apelido = apelido;
        this.numPatrimonio = numPatrimonio;
        this.status = LIVRE;
    }

    public String getApelido() {
        return apelido;
    }

    public long getNumPatrimonio() {
        return numPatrimonio;
    }

    public int getStatus() {
        return status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Projetor)) return false;

        Projetor projetor = (Projetor) o;

        return numPatrimonio == projetor.numPatrimonio;

    }
}
