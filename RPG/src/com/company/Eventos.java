/*
para evento que podem ser aleatorios como surgimento de monstro, de desastres naturais...
 */

package com.company;

public class Eventos {
    //para perder valores em int
    public int perde(int init, int quant){
        init = init - quant;
        return init;
    }

    //para perder valores em float
    public float perde(float init, float quant){
        init = init - quant;
        return init;
    }

    //para ganhar valores em float
    public int ganha(int init, int quant){
        init = init + quant;
        return init;
    }

    //para ganhar valores em float
    public float ganha(float init, float quant){
        init = init + quant;
        return init;
    }

}
