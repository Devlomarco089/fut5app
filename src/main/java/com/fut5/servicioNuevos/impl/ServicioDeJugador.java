package com.fut5.servicioNuevos.impl;


import java.util.List;
import java.util.Scanner;


import com.fut5.dominio.Equipo;
import com.fut5.dominio.Jugador;

public class ServicioDeJugador{
    ServicioDeEscaneo sc = new ServicioDeEscaneo();
    public void crearJugador(Equipo equipo){
        int i = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nombre del jugador: ");
        String nombre = scanner.nextLine();
        System.out.println("Apellido del jugador: ");
        String apellido = scanner.nextLine();
        System.out.println("Altura del jugador: ");
        int altura = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Posicion del jugador (nota: arquero, defensor, medio campista, delantero): ");
        String posicion = scanner.nextLine();
        System.out.println("Cantidad de goles: ");
        int goles = scanner.nextInt();
        scanner.nextLine();
        int partidos = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Numero Dorsal: ");
        int dorsal = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Es capitán (si/no): ");
        String capitan = scanner.nextLine();
        scanner.close();
        Boolean esCapitan = capitan.equalsIgnoreCase("si");
        Jugador jugador = new Jugador(i, nombre, apellido, altura, posicion, goles, partidos, esCapitan, dorsal);
        equipo.getJugadores().add(jugador);
        }


    public Jugador buscarJugador(List<Equipo> equipos, String nombre){
        Jugador jugadorEncontrado = null;
        for (Equipo equipo : equipos){
            for(Jugador jugador : equipo.getJugadores()){
                if (jugador.getNombre().equalsIgnoreCase(nombre)){
                    jugadorEncontrado = jugador;
                }else{
                    System.out.println("Jugador no encontrado");
                }
            }
        }
        return jugadorEncontrado;
    }

    public void EliminarJugador(List<Equipo> equipos, String nombre){
        Jugador jugadorEncontrado = buscarJugador(equipos, nombre);
        if(jugadorEncontrado != null){
            
        }  
    }

    public void mostrarJugadores(Equipo equipo){
        List<Jugador> jugadores = equipo.getJugadores();
        if (jugadores != null){
            for (Jugador jugador : jugadores){
                System.out.println("--------------------------------------------------------------");
                System.out.println("Nombre: " + jugador.getNombre() + " " + jugador.getApellido());
                System.out.println("Posicion: " + jugador.getPosicion());
                System.out.println("Dorsal : " + jugador.getNumeroCamiseta());
                System.out.println("Goles: " + jugador.getGoles());
                System.out.println("Partidos: " + jugador.getPartidos());
                System.out.println("Capitan del equipo: " + (jugador.isCapitan() ? "si": "no"));
                System.out.println("--------------------------------------------------------------");
            }
        }
    }

    public void mostrarJugadorUnico(List<Equipo> equipos, String nombre){
        Jugador jugador = buscarJugador(equipos, nombre);
        if (jugador != null){
            System.out.println("--------------------------------------------------------------");
            System.out.println("Nombre: " + jugador.getNombre() + " " + jugador.getApellido());
            System.out.println("Posicion: " + jugador.getPosicion());                System.out.println("Dorsal : " + jugador.getNumeroCamiseta());
            System.out.println("Goles: " + jugador.getGoles());
            System.out.println("Partidos: " + jugador.getPartidos());
            System.out.println("Capitan del equipo: " + (jugador.isCapitan() ? "si": "no"));
            System.out.println("--------------------------------------------------------------");
        }
    }
    
}