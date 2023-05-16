package com.softtek.modelo.Ejercicio1;

public class Barcaza extends Vehiculo implements Nautico {
    @Override
    public String atracar() {
        return "BRRMMM mmm m mmmm PLOP PLOP *Atraca*";
    }

    @Override
    public String navegar() {
        return "BRMMMMMMM FLOPP FLOPP";
    }
}
