package com.otavio.projetor.entidades;

import java.util.Date;
/**
 * Created by Otavio on 06/02/2017.
 */

public class Emprestimo {
    private int id;
    private Date data;
    private int duration;
    Projetor projetor;
    Funcionario secretaria;
    Usuario usuario;
    private boolean isEmprestimoRealizado;

    public Emprestimo(Date data, int duration, Projetor projetor, Funcionario secretaria, Usuario usuario, boolean isEmprestimoRealizado) {
        this.data = data;
        this.duration = duration;
        this.projetor = projetor;
        this.secretaria = secretaria;
        this.usuario = usuario;
        this.isEmprestimoRealizado = isEmprestimoRealizado;
    }

    public void emprestar(){
        isEmprestimoRealizado = true;
    }
    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }
    public Date getData(){
        return data;
    }
    public void setDate(Date data){
        this.data = data;
    }
    public Projetor getProjetor(){
        return projetor;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Emprestimo)) return false;
        Emprestimo that = (Emprestimo) o;
        return (this.projetor.equals(that.projetor)) && ((this.data.compareTo(that.getData())) == 0);
    }

    @Override
    public int hashCode() {
        return getId();
    }
}