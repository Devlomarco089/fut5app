package com.fut5.servicios;

import com.fut5.boostrap.Equipos;
import com.fut5.dominio.Equipo;
import com.fut5.dominio.Jugador;

public class Bjugador{
    public static void buscarJugador(){
        System.out.println("Nombre del jugador: ");
        String nombre = Escanear.leerLinea();
        Jugador jugador = Equipo.buscarJugador(nombre);
        Equipo equipo = Equipos.buscarEquipoJ(nombre);
        if (jugador != null){
            System.out.println("Nombre: " + jugador.getNombre() + " " + jugador.getApellido());
            boolean capitan = jugador.isCapitan();
            if (capitan){
                System.out.println("Es capitan");
            }else {
                System.out.println("No es capitan");
            }
            System.out.println("Equipo: " + equipo.getNombre());
        }
    }
}