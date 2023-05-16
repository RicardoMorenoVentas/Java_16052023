package com.softtek.controlador;

import com.softtek.modelo.Ejercicio2.Coche;
import com.softtek.modelo.Ejercicio2.Conductor;

public class TestCoche {
    public static void main(String[] args) {
        Coche coche = new Coche(2);
        Conductor pepe = new Conductor(coche);
        System.out.println(pepe.conducir());
    }
}
