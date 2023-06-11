package com.fut5.servicios;

import java.util.List;


import com.fut5.dominio.Equipo;

public class Eliminar {

    public void elimiarEquipo(List<Equipo> equipos){
        System.out.println("Nombre de equipo a eliminar: ");
        String nombre = Escanear.leerLinea();
        Equipo equipoEncontrado = null;
        for (Equipo e : equipos){
            if (e.getNombre().equalsIgnoreCase(nombre)){
                equipoEncontrado = e;
            }
        }
        System.out.println("Eliminando equipo...");
        if (equipoEncontrado == null){
            System.out.println("Equipo no encontrado");
        }else{
            equipos.remove(equipoEncontrado);
            System.out.println("Equipo Eliminado");
        }
        System.out.println("-----------------------------------------------");
    }
}
