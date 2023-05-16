package com.softtek.modelo.Ejercicio2;

public class Conductor {
    IVehiculo vehiculo;

    public Conductor(IVehiculo coche_e){
        this.vehiculo = coche_e;
    }

    public String conducir(){
        return this.vehiculo.moverse();
    }
}
