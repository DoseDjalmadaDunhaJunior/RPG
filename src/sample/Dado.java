package com.company;

import java.util.Random;

public class Dado {
    //inicia todos os dados zerados
    public Dado(){
        tam = 0;
        valor = 0;
    }

    //para inserir o valor maximo do dado
    public void tamanhoDado(int size){
         tam = size;
    }

    //para rodar o dado
    public void setValor(){
        Random bot = new Random();
        valor =  bot.nextInt(tam);
    }

    //pega o valor dado anteriormente para jogar
    public int getValor(){
        return valor;
    }

    //retorna o tamanho do dado(nao vejo utilidade ainda mas pode vir a ter)
    public int getTam(){
        return tam;
    }

    private int tam;
    private int valor;
}
