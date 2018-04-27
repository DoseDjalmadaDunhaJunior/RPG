package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Ficha {
    //para garantir que a classe seria iniciada zerada
    public Ficha(){
        categoria = null;
        nomeJogador = null;
    }

    //para por o nome da classe do jogador(fada, barbaro,mago...)
    public void classe(String nome){
        categoria = nome;
    }

    //simplismente para por o nome do jogador
    public void nome(String name){
        categoria = name;
    }

    //cria um vetor dinamico para os atributos, podendo assim ter infinitos atributos
    public void setVet_tamanho(int tam){
        Atributo aux[] = new Atributo[tam];
        atr = aux;
    }

    //da um tamanho fixo para a quantidade de dados na partida
    public void setTamnho_emCasa(int quantidade){
        Dado[] aux = new Dado[quantidade];
        emCasa = aux;
    }

    private String categoria;
    private Atributo atr[];
    //sim, isso é uma piada
    private Dado emCasa[];
    private  String nomeJogador;
}
