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
