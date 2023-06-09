package com.fut5.servicios;


import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import com.fut5.boostrap.Equipos;
import com.fut5.dominio.Entrenador;
import com.fut5.dominio.Equipo;
import com.fut5.dominio.Jugador;

public class Importar {
    public static void impor() {
        try (Reader reader = new FileReader("src\\main\\java\\com\\fut5\\recursos\\jugadores.txt");
            CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT)) {
            System.out.println("Crear Nombre Equipo:");
            String nombree = Escanear.leerLinea();
            System.out.println("Fecha de creacion: ");
            String fecha = Escanear.leerLinea();
            System.out.println("Nombre Entrenador: ");
            String entrenador = Escanear.leerLinea();
            System.out.println("Apellido Entrenador: ");
            String aentrenador = Escanear.leerLinea();
            int edad = Escanear.leerEnetero();
            Escanear.leerLinea();
            Equipo equipo = new Equipo(nombree, fecha);
            for (CSVRecord csvRecord : csvParser) {
                int id = Integer.parseInt(csvRecord.get(0));
                String nombre = csvRecord.get(1);
                String apellido = csvRecord.get(2);
                Double altura = Double.parseDouble(csvRecord.get(3));
                String posicion = csvRecord.get(4);
                int goles = Integer.parseInt(csvRecord.get(5));
                int partidos = Integer.parseInt(csvRecord.get(6));
                boolean capitan = Boolean.parseBoolean(csvRecord.get(7));
                int dorsal = Integer.parseInt(csvRecord.get(8));
                Jugador jugador = new Jugador(id, nombre, apellido, altura, posicion, goles, partidos, capitan, dorsal);
                equipo.agregarJugador(jugador);
            }
            Entrenador nentrenador = new Entrenador(entrenador, aentrenador, edad); 
            equipo.setEntrenador(nentrenador);
            Equipos.agregarEquipo(equipo);
        } catch (IOException e) {
            System.out.println("Error al Importar Jugadores");
            e.printStackTrace();
        }
    }
}
