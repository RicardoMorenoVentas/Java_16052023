package com.softtek.modelo.Ejercicio1;

public class Hidroavion extends Avion implements Nautico {
    @Override
    public String atracar() {
        return "FIUMMMM SPLASHH";
    }

    @Override
    public String navegar() {
        return "BRR FLUSHH FLUSSSH";
    }
}
