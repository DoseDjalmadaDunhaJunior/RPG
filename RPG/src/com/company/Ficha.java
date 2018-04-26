package com.company;

import java.util.Random;
import java.util.Scanner;

public class Ficha {
    //para garantir que a classe seria iniciada zerada
    public Ficha(){
        categoria = null;
        nomeJogador = null;
        dado = 0;
    }
    //para por o nome da classe do jogador(fada, barbaro,mago...)
    public void classe(){
        Scanner nome = new Scanner(System.in);
        categoria = nome.nextLine();
    }
    //simplismente para por o nome do jogador
    public void nome(){
        Scanner name = new Scanner(System.in);
        categoria = name.nextLine();
    }
    //para inserir o valor maximo do dado
    public void tamanhoDado(){
        Scanner max = new Scanner(System.in);
        dado = max.nextInt();
    }
    //para rodar o dado
    public int valorDado(){
        Random bot = new Random();
        return bot.nextInt(dado);
    }

    private String categoria;
    private  String nomeJogador;
    private int dado;
}
