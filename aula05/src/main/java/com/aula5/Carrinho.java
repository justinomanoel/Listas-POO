package com.aula5;

import java.util.ArrayList;

public class Carrinho {

    // o arrayList permite o polimorfismo paramétrico
    private ArrayList<Produto> carrinho;

    public Carrinho() {
        carrinho = new ArrayList<>();
    }

    public void inserir(Produto produto) {
        if(produto == null){
            System.out.println("Produto nulo");
            return;
        }
        carrinho.add(produto);
    }

    public void listar(){
        for(Produto produto : carrinho){
            produto.mostrar();
        }
    }

    public void listarIndexado(){
        for(int i = 0; i < carrinho.size(); i++){
            carrinho.get(i).mostrar();
        }
    }
}
