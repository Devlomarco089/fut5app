package com.fut5.servicios;

import java.util.List;

import com.fut5.dominio.Equipo;
import com.fut5.dominio.Jugador;

public class JugadorBuscar {
    public Jugador encontrarJugador(List<Equipo> equipos){
        System.out.println("Nombre del Jugador: ");
        String x = Escanear.leerLinea();
        Jugador jugadorEncontrado = null;
        Equipo equipoEncontrado = null;
        for (Equipo equipo : equipos){
            for(Jugador jugador : equipo.getJugadores()){
                if(jugador.getNombre().equalsIgnoreCase(x)){
                    jugadorEncontrado = jugador;
                }
            }
        }
        for (Equipo equipo : equipos){
            for(Jugador jugador : equipo.getJugadores()){
                if(jugador.getNombre().equalsIgnoreCase(x)){
                    equipoEncontrado = equipo;
                }
            }
        }
        if (jugadorEncontrado != null){
            System.out.println("Nombre: " + jugadorEncontrado.getNombre() + " " + jugadorEncontrado.getApellido());
            boolean capitan = jugadorEncontrado.isCapitan();
            if (capitan){
                System.out.println("Es capitan");
            }else {
                System.out.println("No es capitan");
            }
            System.out.println("Equipo: " + equipoEncontrado.getNombre());
        }else{
            System.out.println("Jugador no encontrado");
            System.out.println("------------------------");
        }
        return jugadorEncontrado;
        }
}
