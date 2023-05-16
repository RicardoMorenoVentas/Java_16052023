package com.softtek.modelo.Ejercicio1;

public class Ave extends Animal implements ObjetoVolador {
    @Override
    public String despegar() {
        return "BRR BRRRR";
    }

    @Override
    public String aterrizar() {
        return "FLOP FLOP FLOP SLIUM";
    }

    @Override
    public String volar() {
        return "FLOP FLOP";
    }

    public String hacerNido(){
        return "PIO PIO *Hace el nido*";
    }

    public String ponerHuevos(){
        return "PLOP *Pone un huevo* ";
    }

    @Override
    public String comer(){
        return "PIO PIO *Se come un gusano*";
    }
}
