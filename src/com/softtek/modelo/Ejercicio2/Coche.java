package com.softtek.modelo.Ejercicio2;

public class Coche implements IVehiculo{
    private int deposito;

    public Coche(){
        this.deposito = 100;
    }

    public Coche(int deposito){
        this.deposito = deposito;
    }

    @Override
    public String moverse() {
        this.deposito--;
        return deposito > 0 ? "Se mueve" : "No se mueve";
    }

}
