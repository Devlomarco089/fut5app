package com.fut5.servicioNuevos.impl;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;

import com.fut5.dominio.Equipo;
import com.fut5.dominio.Jugador;



public class ServicioDeArchivos {
    
    ServicioDeEscaneo sc = new ServicioDeEscaneo();
    ServicioDeEquipo servicioDeEquipo = new ServicioDeEquipo();
    public void importarEquipo(List<Equipo> equipos){
        try (Reader reader = new FileReader("src\\main\\java\\com\\fut5\\recursos\\jugadores.txt");
            CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT)) {
            System.out.println("Nombre del equipo a importar ");
            String equipon = sc.leerLinea();
            Equipo equipoEncontrado = servicioDeEquipo.buscarEquipo(equipos, equipon);
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
                equipoEncontrado.getJugadores().add(jugador);
            }
            System.out.println("Jugadores Importados.");
            System.out.println("-----------------------------");
        } catch (IOException e) {
            System.out.println("Error al Importar Jugadores");
            System.out.println("-----------------------------");
            e.printStackTrace();
        }
    }
    public void exportarEquipo(List<Equipo> equipos){
        System.out.println("Nombre del Equipo a Exportar: ");
        String equipon = sc.leerLinea();
        Equipo equipoEncontrado = servicioDeEquipo.buscarEquipo(equipos, equipon);
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
    }
}
