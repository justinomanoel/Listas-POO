package com.aula4;

public class Cliente {
    
    private String nome;
    private Endereco endereco;

    public Cliente(Endereco endereco, String nome) {
        this.endereco = endereco;
        this.nome = nome;
    }

    public void mostrarDados(){
        System.out.println("Nome: " + nome);
        endereco.mostrarEndereco();
    }
}
