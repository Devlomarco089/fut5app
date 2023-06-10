package com.fut5.servicios;

import com.fut5.dominio.Jugador;
import com.fut5.dominio.Equipo;
import com.fut5.boostrap.Equipos;
public class buscarJugador {
    public static Jugador encontrarJugador(String nombre){
        for (Equipo equipo : Equipos.equipos){
            for (Jugador jugador : equipo.jugadores){
                if (jugador.getNombre().equalsIgnoreCase(nombre)){
                    return jugador;
                }
            }
    }
        return null;}
    public static Equipo encontrarEquipo(String nombre){
        for (Equipo equipo : Equipos.equipos){
            for (Jugador jugador : equipo.jugadores){
                if (jugador.getNombre().equalsIgnoreCase(nombre)){
                    return equipo;
                }
            }
    }
        return null;
    }
}

