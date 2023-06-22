package com.fut5.servicioNuevos.impl;



import com.fut5.dominio.Entrenador;
import com.fut5.dominio.Equipo;

public class ServicioDeEntrenador {
    ServicioDeEscaneo sc = new ServicioDeEscaneo();
    public Entrenador crearEntrenador(){
        System.out.println("Nombre del entrenador: ");
        String nombreEntrenador = sc.leerLinea();
        System.out.println("Apellido del entrenador: ");
        String apellidoEntrenador = sc.leerLinea();
        System.out.println("Edad del entrenador: ");
        int edadEntrenador = sc.leerInt();
        Entrenador entrenador = new Entrenador(nombreEntrenador, apellidoEntrenador, edadEntrenador);
        return entrenador;
    }

    public void mostrarEntrenador(Equipo equipo){
        Entrenador entrenador = equipo.getEntrenador();
        System.out.println("Entrenador: " + entrenador.getNombre() + " " + entrenador.getApellido() + " edad:" + entrenador.getEdad());
    }
}
