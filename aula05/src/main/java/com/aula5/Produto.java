package com.aula5;

public class Produto {
    
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void mostrar(){
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
    }
}
