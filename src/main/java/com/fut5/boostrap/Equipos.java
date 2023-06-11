package com.fut5.boostrap;

import java.util.ArrayList;


import com.fut5.dominio.Equipo;


public class Equipos {
    public ArrayList<Equipo> equipos = new ArrayList<>();

    public void agregarEquipo(Equipo equipo) {
        equipos.add(equipo);
    }

    public Equipo buscarEquipo(String nombre) {
        Equipo equipo = null;
        for (Equipo e : equipos) {
            if (e.getNombre().equalsIgnoreCase(nombre)) {
                equipo = e;
            }
        }
        return equipo;
    }

    public void eliminarEquipo(Equipo equipo) {
        equipos.remove(equipo);
    }

}