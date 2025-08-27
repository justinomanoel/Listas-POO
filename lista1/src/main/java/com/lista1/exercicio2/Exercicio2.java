/*Exercıcio 2. Implemente uma classe Lampada com os seguintes componentes
e faça um teste ao final: Atributos: estado(Enum) métodos:
• click(): ao chamar este método a lâmpada é colocada no estado ”apagada” caso esteja ”acesa” e é colocado no estado ”acesa” caso esteja ”apagada”.
• qtdAcendimentos(): retorna quantas vezes a lâmpada foi acesa (DICA:
este método deve ser chamada no método acima).
• checaEstado(): retorna o estado atual da lâmpada. */

package com.lista1.exercicio2;

public class Exercicio2 {
    public static void main(String[] args) {
        Lampada l1 = new Lampada(Estado.APAGADA);

        l1.click();
        System.out.println("Clique: " + l1.checaEstado()); 
        System.out.println("Quantidade de acendimentos: " + l1.qtdAcendimentos()); 
        l1.click();
        System.out.println("Clique: " + l1.checaEstado()); 
        System.out.println("Quantidade de acendimentos: " + l1.qtdAcendimentos()); 
        l1.click();
        System.out.println("Clique: " + l1.checaEstado());
        System.out.println("Quantidade de acendimentos: " + l1.qtdAcendimentos());
    }
}
