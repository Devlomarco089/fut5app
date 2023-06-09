package com.fut5.dominio;

import java.util.ArrayList;
import java.util.List;

public class Equipo {
    private String nombre;
    private String fechaDeCreacion;
    public static List<Jugador> jugadores;
    
    
    private Entrenador entrenador;
    public Equipo(){

    }
    public Equipo(String nombre, String fechaDeCreacion){
        this.nombre = nombre;
        this.fechaDeCreacion = fechaDeCreacion;
        jugadores = new ArrayList<>();
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getFechaDeCreacion() {
        return fechaDeCreacion;
    }
    public void setFechaDeCreacion(String fechaDeCreacion) {
        this.fechaDeCreacion = fechaDeCreacion;
    }
    public List<Jugador> getJugadores() {
        return  jugadores;
    }
    public static void setJugadores(List<Jugador> jugadores) {
        Equipo.jugadores = jugadores;
    }
    public Entrenador getEntrenador() {
        return entrenador;
    }
    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }
    public void agregarJugador(Jugador jugador) {jugadores.add(jugador);}

    public static Jugador buscarJugador(String nombre){
            for (Jugador jugador : jugadores){
                if (jugador.getNombre().equalsIgnoreCase(nombre)){
                    return jugador;}
            }
        return null;
    }
}


