package com.fut5.servicios;

import java.util.List;

import com.fut5.dominio.Entrenador;
import com.fut5.dominio.Equipo;
import com.fut5.dominio.Jugador;
import com.fut5.boostrap.Equipos;
public class Buscar {
    
    public static void buscarEquipo(){
        System.out.println("Igrese el nombre del equipo: ");
        String nombre = Escanear.leerLinea();
        Equipo equipoEncontrado = Equipos.buscarEquipo(nombre);
        if (equipoEncontrado != null){
            System.out.println("Nombre del equipo: " + equipoEncontrado.getNombre());
            System.out.println("Fecha de creacion del equipo: " + equipoEncontrado.getFechaDeCreacion());
            Entrenador entrenador = equipoEncontrado.getEntrenador();
            System.out.println("Entrenador: " + entrenador.getNombre() + " " + entrenador.getApellido() + " edad:" + entrenador.getEdad());
            System.out.println("Jugadores del equipo: ");
            List<Jugador> jugadores = (List<Jugador>) equipoEncontrado.getJugadores();
            for (Jugador jugador : jugadores){
                System.out.println("Nombre: " + jugador.getNombre() + " " + jugador.getApellido());
                System.out.println("Posicion: " + jugador.getPosicion());
                System.out.println("Dorsal : " + jugador.getNumeroCamiseta());
                System.out.println("Goles: " + jugador.getGoles());
                System.out.println("Partidos: " + jugador.getPartidos());
                System.out.println("Capitan del equipo: " + (jugador.isCapitan() ? "si": "no"));
                System.out.println("--------------------------------------------------------------");


            }
        }else {
            System.out.println("Equipo no encontrado");
            System.out.println("-----------------------------------------------------------");
        }
    }
}
