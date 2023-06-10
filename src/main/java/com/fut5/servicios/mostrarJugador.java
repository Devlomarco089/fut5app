package com.fut5.servicios;


import com.fut5.dominio.Equipo;
import com.fut5.dominio.Jugador;
public class mostrarJugador{
    public static void MostrarJugador(){
        System.out.println("Nombre del jugador: ");
        String nombre = Escanear.leerLinea();
        Jugador jugador = buscarJugador.encontrarJugador(nombre);
        Equipo equipo = buscarJugador.encontrarEquipo(nombre);
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