package com.aula5;

public class Lista {
    private int[] valores;
    private int atual;
    private static int MAX = 5;

    public Lista() {
        // vai criar algo como [0,0,0,0,0]
        // int é um tipo primitivo
        valores = new int[MAX];
    }
    
    public void adicionar(int valor){
        if(atual == MAX){
            System.out.println("MÁXIMO ATINGIDO");
            return;
        }

        valores[atual++] = valor;
    }

    public int apagar() throws Exception{
        if(atual <= 0){
            throw new Exception("NAO HA MAIS NADA");
        }
        int apagado = valores[--atual];
        return apagado;
    }

    public void mostrar(){
        for(int i = 0; i < atual; i++){
            System.out.println(valores[i]);
        }
        System.out.println();
    }
}
