package com.fut5.servicios;

import com.fut5.boostrap.Equipos;
import com.fut5.dominio.Equipo;

public class Eliminar {
    public static void elimiarEquipo(){
        System.out.println("Nombre de equipo a eliminar: ");
        String nombre = Escanear.leerLinea();
        Equipo equipoEncontrado = Equipos.buscarEquipo(nombre);
        Equipos.eliminarEquipo(equipoEncontrado);
        System.out.println("Eliminando equipo...");
        if (equipoEncontrado == null){
            System.out.println("Equipo no encontrado");
        }
        System.out.println("-----------------------------------------------");
    }
}
