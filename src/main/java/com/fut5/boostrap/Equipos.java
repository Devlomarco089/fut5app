package com.fut5.boostrap;

import java.util.ArrayList;


import com.fut5.dominio.Equipo;




public class Equipos {
    public static ArrayList<Equipo> equipos = new ArrayList<>();

    public static void agregarEquipo(Equipo equipo) {
        equipos.add(equipo);
    }

    public static Equipo buscarEquipo(String nombre) {
        for (Equipo equipo : equipos) {
            if (equipo.getNombre().equalsIgnoreCase(nombre)) {
                return equipo;
            }
        }
        return null;
    }


    public static void eliminarEquipo(Equipo equipo) {
        equipos.remove(equipo);
    }


    public static void add(Equipo equipo1) {
    }

}
