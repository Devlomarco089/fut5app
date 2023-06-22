package com.fut5.servicioNuevos.impl;



import com.fut5.dominio.Entrenador;
import com.fut5.dominio.Equipo;


import java.util.List;



public class ServicioDeEquipo {

    ServicioDeEntrenador servicioEntrenador = new ServicioDeEntrenador();
    ServicioDeJugador servicioJugador = new ServicioDeJugador();
    ServicioDeEscaneo sc = new ServicioDeEscaneo();
    public Equipo buscarEquipo(List<Equipo> equipos, String nombre){
        Equipo equipoEncontrado = null;
        for(Equipo equipo : equipos){
            if(equipo.getNombre().equalsIgnoreCase(nombre)){
                equipoEncontrado = equipo;
            }
        }
        if (equipoEncontrado == null){
            System.out.println("Equipo No Encontrado.");
        }
        return equipoEncontrado;
    }

    public void eliminarEquipo(List<Equipo> equipos, String nombre){
        Equipo equipo = buscarEquipo(equipos, nombre);
        equipos.remove(equipo);
    }

    public void agregarEquipo(List<Equipo> equipos, Equipo equipo){
        equipos.add(equipo);
    }

    public void mostrarEquipo(List<Equipo> equipos, String nombre){
            Equipo equipo = buscarEquipo(equipos, nombre);
            if (equipo != null){
                System.out.println("Nombre del equipo: " + equipo.getNombre());
                System.out.println("Fecha de creacion del equipo: " + equipo.getFechaDeCreacion());
                servicioEntrenador.mostrarEntrenador(equipo);
                servicioJugador.mostrarJugadores(equipo);
            }else{
                System.out.println("Equipo no encontrado");
            }
    }

    public void crearEquipo(List<Equipo> equipos){
        System.out.println("Nombre Del equipo: ");
        String nombre = sc.leerLinea();
        System.out.println("Fecha de creacion del equipo: ");
        String fechaCreacion = sc.leerLinea();
        Equipo equipo = new Equipo(nombre, fechaCreacion);
        Entrenador entrenador = servicioEntrenador.crearEntrenador();
        equipo.setEntrenador(entrenador);
        System.out.println("Cuantos jugadores desea cargar: ");
        int numeroJugadores = sc.leerInt();
        for (int i = 0; i < numeroJugadores; i++ ){
            servicioJugador.crearJugador(equipo);
        }
    }
    
}
