package com.softtek.controlador;

import com.softtek.modelo.Ejercicio3.*;

public class TestTalleres {
    public static void main(String[] args) {

        Coche coche = new Coche();

        TallerPintura pintura = new TallerPintura();

        SeguroCoche seguros = new SeguroCoche(new TallerMecanica(),"Pepito");

        System.out.println(seguros.reparar(coche));

        seguros.setTaller_aseguradora(pintura);

        System.out.println(seguros.reparar(coche));

    }
}
