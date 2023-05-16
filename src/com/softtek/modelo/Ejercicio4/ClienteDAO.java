package com.softtek.modelo.Ejercicio4;

public class ClienteDAO implements IDAO{
    @Override
    public String insertar(Cliente c1) {
        return "Inserto el cliente " + c1.toString();
    }
}
