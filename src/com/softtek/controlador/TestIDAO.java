package com.softtek.controlador;

import com.softtek.modelo.Ejercicio4.AccesoDesarrollo;
import com.softtek.modelo.Ejercicio4.Cliente;
import com.softtek.modelo.Ejercicio4.ClienteDAO;
import com.softtek.modelo.Ejercicio4.IDAO;

public class TestIDAO {
    public static void main(String[] args) {
        IDAO[] idaos = new IDAO[]{
                new AccesoDesarrollo(),
                new AccesoDesarrollo(),
                new ClienteDAO(new AccesoDesarrollo())
        };

        for (IDAO idao: idaos){
            System.out.println(idao.insertar(new Cliente()));
        }
    }
}
