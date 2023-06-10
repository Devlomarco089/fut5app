package com.fut5.servicios;

import com.fut5.dominio.Entrenador;
import com.fut5.dominio.Equipo;
import com.fut5.dominio.Jugador;

import java.util.ArrayList;

import com.fut5.boostrap.Equipos;
public class crearequipo {
    
    public static void crearEquipo(){
        System.out.println("Nombre Del equipo: ");
        String nombre = Escanear.leerLinea();
        System.out.println("Fecha de creacion del equipo: ");
        String fechaCreacion = Escanear.leerLinea();
        Equipo equipo = new Equipo(nombre, fechaCreacion);
        System.out.println("Cargado Exitosamente");
        System.out.println("Cargar Entrenador... ");
        System.out.println("Nombre del entrenador: ");
        String nombreEntrenador = Escanear.leerLinea();
        System.out.println("Apellido del entrenador: ");
        String apellidoEntrenador = Escanear.leerLinea();
        System.out.println("Edad del entrenador: ");
        int edadEntrenador = Escanear.leerEnetero();
        Escanear.leerLinea();
        Entrenador entrenador = new Entrenador(nombreEntrenador, apellidoEntrenador, edadEntrenador);
        equipo.setEntrenador(entrenador);
        System.out.println("Cargado Exitosamente");
        System.out.println("Cargar jugadores...");
        boolean seSeleccionoCapitan = false;
        ArrayList<Jugador> jugadores = new ArrayList<>();
        System.out.println("Cuantos jugadores desea cargar (recomendable 5): ");
        int n = Escanear.leerEnetero();
        Escanear.leerLinea();
        for(int i = 0; i < n; i++) {
            System.out.println("Nombre del jugador: ");
            String nombreJugador = Escanear.leerLinea();
            System.out.println("Apellido del jugador: ");
            String apellidoJugador = Escanear.leerLinea();
            System.out.println("Altura del jugador: ");
            double alturaJugador = Escanear.leerDoble();
            Escanear.leerLinea();
            System.out.println("Posicion del jugador (nota: arquero defensor medio campista defensor): ");
            String posicionJugador = Escanear.leerLinea();
            System.out.println("Cantidad de goles: ");
            int golesJugador = Escanear.leerEnetero();
            Escanear.leerLinea();
            System.out.println("Cantidad de partidos: ");
            int partidosJugador = Escanear.leerEnetero();
            Escanear.leerLinea();
            System.out.println("Numero Dorsal: ");
            int dorsalJugador = Escanear.leerEnetero();
            Escanear.leerLinea();
            boolean esCapitan = false;
            if (!seSeleccionoCapitan) {
                System.out.println("Es capitán (si/no): ");
                String capitan = Escanear.leerLinea();
                esCapitan = capitan.equalsIgnoreCase("si");
                seSeleccionoCapitan = true; 
            }
            Jugador Jugador = new Jugador(i, nombreJugador, apellidoJugador, alturaJugador, posicionJugador, golesJugador, partidosJugador, esCapitan, dorsalJugador);
            jugadores.add(Jugador);
        }
        equipo.setJugadores(jugadores);
        Equipos.agregarEquipo(equipo);
        System.out.println("------------------------------------");
    }
    }

