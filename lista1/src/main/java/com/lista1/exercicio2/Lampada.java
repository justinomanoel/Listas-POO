package com.lista1.exercicio2;

public class Lampada {
    private Estado estado;
    private int contadorAcendimento;

    public Lampada(Estado estado) {
        this.estado = estado;
    }

    public void click(){
        if(estado == Estado.APAGADA){
            estado = Estado.ACESA;
            contadorAcendimento++;
        }else{
            estado = Estado.APAGADA;
        }
    }

    public int qtdAcendimentos(){
        return contadorAcendimento;
    }

    public Estado checaEstado() {
        return estado;
    }    
}


