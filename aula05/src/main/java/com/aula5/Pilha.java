package com.aula5;

public class Pilha<T> {
    
    private Pilha<T> prox;
    private T valor;

    public Pilha(T valor){
        this.valor = valor;
    }

    public void empilhar(T valor){
        if(prox == null){
        prox = new Pilha(valor);
        return;
        }
        empilharAux(valor, prox);
    }

    private Pilha<T> empilharAux(T valor, Pilha<T> aux){
        if(aux.prox == null){
            aux.prox = new Pilha(valor);
            return aux;
        }
        
        return empilharAux(valor, aux.prox);
    }

    public void imprimir(){
        if(prox != null)
            prox.imprimir();
        System.out.println(valor);
    }
}
