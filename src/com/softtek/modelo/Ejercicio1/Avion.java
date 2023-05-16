package com.softtek.modelo.Ejercicio1;

public class Avion extends Vehiculo implements ObjetoVolador {
    @Override
    public String despegar() {
        return "FIUUUUUUUUUUUMMMM";
    }

    @Override
    public String aterrizar() {
        return "SKIIIIIIIRRRR";
    }

    @Override
    public String volar() {
        return "FGGGGGGGGGGG";
    }
}
