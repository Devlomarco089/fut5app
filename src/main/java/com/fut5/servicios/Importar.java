package com.fut5.servicios;


import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;


import java.util.List;



import com.fut5.dominio.Equipo;
import com.fut5.dominio.Jugador;

public class Importar {
    
    public void impor(List<Equipo> equipos) {
        try (Reader reader = new FileReader("src\\main\\java\\com\\fut5\\recursos\\jugadores.txt");
            CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT)) {
            System.out.println("Nombre del equipo a importar ");
            String equipon = Escanear.leerLinea();
            Equipo equipoEncontrado = null;
            for (Equipo e : equipos){
                if (e.getNombre().equalsIgnoreCase(equipon))
                equipoEncontrado = e;
            }
            
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
}
