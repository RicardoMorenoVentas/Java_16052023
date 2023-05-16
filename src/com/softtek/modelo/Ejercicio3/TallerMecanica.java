package com.softtek.modelo.Ejercicio3;

public class TallerMecanica implements  ITaller{

    @Override
    public String reparar(Coche coche) {
        return "Cambian bujias";
    }
}
