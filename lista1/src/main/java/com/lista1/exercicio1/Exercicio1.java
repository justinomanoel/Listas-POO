package com.lista1.exercicio1;

public class Exercicio1 {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Manoel", "M",20, false);

        Churrasco churrasco = new Churrasco();

        churrasco.verificarConsumo(p1);
        if(p1.vegetariana)
            System.out.println(p1.nome + " não come carne.");
        else
            System.out.println("O consumo do " + p1.nome + " foi de " + churrasco.qtdCarne + " kg de carne.");
}
}