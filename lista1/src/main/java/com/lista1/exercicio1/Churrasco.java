package com.lista1.exercicio1;

public class Churrasco {
    double qtdCarne;

    public void verificarConsumo(Pessoa pessoa){
        if(pessoa.vegetariana || pessoa.idade <= 3){
            qtdCarne = 0;
        } else if(pessoa.idade >= 4  && pessoa.idade <= 12){
            qtdCarne = 1.0;
        } else {
            qtdCarne = 2.0;
        }
    }
}