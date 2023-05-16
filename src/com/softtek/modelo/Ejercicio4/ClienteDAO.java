package com.softtek.modelo.Ejercicio4;

public class ClienteDAO implements IDAO{

    IDAO conexion;

    public ClienteDAO(IDAO conexion){
        this.conexion = conexion;
    }
    @Override
    public String insertar(Cliente c1) {
        return "Inserto el cliente " + c1.toString();
    }
}
