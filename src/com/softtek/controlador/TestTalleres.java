package com.softtek.controlador;

import com.softtek.modelo.Ejercicio3.*;

public class TestTalleres {
    public static void main(String[] args) {

        Coche coche = new Coche();

        TallerPintura pintura = new TallerPintura();

        SeguroCoche[] seguros = new SeguroCoche[]{
            new SeguroCoche(new TallerMecanica(),"Pepito")
        };

        for (SeguroCoche aseguradora : seguros){
            System.out.println(aseguradora.reparar(coche));
        }

        System.out.println(pintura.reparar(coche));

    }
}
