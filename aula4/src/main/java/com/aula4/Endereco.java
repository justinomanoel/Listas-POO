package com.aula4;

public class Endereco {
    private String cep, logradouro, cidade;
    private Estado estado;

    public Endereco(String cep, String cidade, Estado estado, String logradouro) {
        this.cep = cep;
        this.cidade = cidade;
        this.estado = estado;
        this.logradouro = logradouro;
    }

    public void mostrarEndereco(){
        System.out.println("CEP: " + cep);
        System.out.println("Logradouro: " + logradouro);
        System.out.println("Cidade: " + cidade);
        System.out.println("Estado: " + estado);
    }
}
