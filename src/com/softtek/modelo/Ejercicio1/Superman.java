package com.softtek.modelo.Ejercicio1;

import com.softtek.modelo.Ejercicio1.Kriptoniano;
import com.softtek.modelo.Ejercicio1.ObjetoVolador;

public class Superman extends Kriptoniano implements ObjetoVolador {
    @Override
    public String despegar() {
        return "*ROMPE EL SUELO AL DESPEGAR*";
    }

    @Override
    public String aterrizar() {
        return "*DESTRUYE EL SUELO AL ATERRIZAR*";
    }

    @Override
    public String volar() {
        return "*ATRAVIESA AVIONES QUE HACEN FGGGGG*";
    }

    public String saltarEdificio(){
        return "KRAAAACK *ROMPE EL SUELO AL SALTAR*";
    }

    public String detenerBala(){
        return "*PLIUMMM*";
    }

    @Override
    public String comer(){
        return "*Mastica rocas* KRUNCH KRUNCH";
    }
}
