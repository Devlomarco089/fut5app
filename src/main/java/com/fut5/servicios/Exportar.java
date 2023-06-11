package com.fut5.servicios;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

import com.fut5.dominio.Equipo;
import com.fut5.dominio.Jugador;

public class Exportar {

    public void Export(List<Equipo> equipos){
        System.out.println("Nombre del Equipo a Exportar: ");
        String equipon = Escanear.leerLinea();
        Equipo equipoEncontrado = null;
        for (Equipo e : equipos){
            if (e.getNombre().equalsIgnoreCase(equipon))
            equipoEncontrado = e;
        }
        if (equipoEncontrado == null){
            System.out.println("Equipo no encontrado");
        }
        if (equipoEncontrado != null){
            List<Jugador> jugadores = equipoEncontrado.getJugadores(); 
        try (Writer writer = new FileWriter("src\\main\\java\\com\\fut5\\recursos\\jugadoresexportados.csv");
            CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT)) {
            for (Jugador jugador : jugadores) {
                csvPrinter.printRecord(jugador.getNombre(), jugador.getApellido(), jugador.getAltura(), jugador.getPosicion(), jugador.getGoles(), jugador.getPartidos(), jugador.isCapitan(), jugador.getNumeroCamiseta());
            }
            
            csvPrinter.flush();
            System.out.println("La lista de jugadores se ha exportado correctamente.");
        } catch (IOException e) {
            System.out.println("Error al exportar jugadores");
            e.printStackTrace();
        }
    }
    }}

