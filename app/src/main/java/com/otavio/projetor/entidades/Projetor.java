package com.otavio.projetor.entidades;

/**
 * Created by Otavio on 06/02/2017.
 */

public class Projetor {

    public static final int LIVRE = 0;
    public static final int EMPRESTADO = 1;
    public static final int MANUTENCAO = 2;

    private int numPatrimonio;
    private int status;//Status para verificar se o projetor já está emprestado ou em manutencao


}
