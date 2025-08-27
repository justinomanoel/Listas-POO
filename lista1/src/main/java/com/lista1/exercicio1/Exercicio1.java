/*Exercício 1. Dada a classe Pessoa que possui os atributos: String nome,
String sexo, int idade, boolean vegetariana. Faça agora uma classe Churrasco
que possua: Atributos: qtdCarne(double); Método: verificarConsumo():
Recebe via parâmetro uma Pessoa e com isto define a consumação média de
carne (quantidade de carne consumida) pessoas de 0 a 3 anos não consomem,
vegetarianos também não. Pessoas de 4 a 12 anos consomem 1 kilo de carne e
de 13 anos em diante 2 kilos de carne.*/

package com.lista1.exercicio1;

public class Exercicio1 {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Manoel", "M",20, false);

        Churrasco churrasco = new Churrasco();

        churrasco.verificarConsumo(p1);
        if(p1.isVegetariana())
            System.out.println(p1.getNome() + " não come carne.");
        else
            System.out.println("O consumo do " + p1.getNome() + " foi de " + churrasco.getQtdCarne() + " kg de carne.");
}
}