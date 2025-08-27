package com.lista1.exercicio1;

public class Churrasco {
    private double qtdCarne;

    public void verificarConsumo(Pessoa pessoa){
        if(pessoa.isVegetariana() || pessoa.getIdade() <= 3){
            qtdCarne = 0;
        } else if(pessoa.getIdade() >= 4  && pessoa.getIdade() <= 12){
            qtdCarne = 1.0;
        } else {
            qtdCarne = 2.0;
        }
    }

    public double getQtdCarne() {
        return qtdCarne;
    }
}