package com.softtek.modelo.Ejercicio3;

public class TallerPintura implements ITaller{
    @Override
    public String reparar(Coche coche) {
        return "Repintan el coche";
    }
}
