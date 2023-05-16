package com.softtek.modelo.Ejercicio4;

public class AccesoProduccion implements IDAO{
    @Override
    public String insertar(Cliente c1) {
        return "Insercción en Producción " + c1.toString();
    }
}
