package com.softtek.controlador;

import com.softtek.modelo.Ejercicio1.*;

public class TestObjetoVolador {
    public static void main(String[] args) {
        Object[] objetos = new Object[]{
                new Ave(),
                new Avion(),
                new Superman(),
                new Hidroavion(),
                new Helicoptero(),
                new Barcaza()
        };

        for (Object obj: objetos) {
            if (obj instanceof ObjetoVolador objVol){
                if (objVol instanceof Ave av){
                    System.out.println("AVE TIME");
                    System.out.println(av.hacerNido());
                    System.out.println(av.ponerHuevos());
                    System.out.println(av.comer());
                }

                if (objVol instanceof Superman sup){
                    System.out.println("DARK SUPERMAN ARRIVES");
                    System.out.println(sup.detenerBala());
                    System.out.println(sup.saltarEdificio());
                    System.out.println(sup.comer());
                }

                if (objVol instanceof Avion av){
                    System.out.println("AVION TIME");
                    if (av instanceof Hidroavion hidro){
                        System.out.println("HIDROMOMENTO");
                    }
                    if (av instanceof Helicoptero heli){
                        System.out.println("ME IDENTIFICO COMO HELICOPTERO APACHE");
                    }
                }
                System.out.println(objVol.despegar());
                System.out.println(objVol.volar());
                System.out.println(objVol.aterrizar());
            }else{
                System.out.println("BARCOS TIME");
            }


            if (obj instanceof Nautico nau){
                System.out.println(nau.atracar());
                System.out.println(nau.navegar());
            }


            System.out.println('\n' + "---------------------" + '\n');
        }
    }
}
