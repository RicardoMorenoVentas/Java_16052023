package com.softtek.modelo.Ejercicio4;

public class AccesoDesarrollo implements IDAO{
    @Override
    public String insertar(Cliente c1) {
        return "Inserto en Desarrollo " + c1.toString();
    }
}
