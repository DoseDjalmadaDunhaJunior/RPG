package com.company;

public class Atributo {
    //para iniciar tudo zerado
    public Atributo(){
        nome = null;
        valor = 0;
        numeros = 0;
    }
    // para dar um texto ao nome
    public void setNome(String txt){
        nome = txt;
    }
    // para dar um valor ao valor que é float
    public void setValor(float val){
        valor = val;
    }
    // para dar um valor ao numeros que é int
    public void setNumeros(int val){
        numeros = val;
    }
    //retorna o nome do atributo
    public String getNome(){
        return nome;
    }
    //retorna o valor float
    public float getValor(){
        return valor;
    }
    //retorna o valor int
    public int getNumeros(){
        return numeros;
    }

    private String nome;
    private float valor;
    private int numeros;
}
