package com.fut5.servicioNuevos.impl;



import com.fut5.boostrap.Equipos;

public class ServicioDeMenu {
    
    public void inizializacionMenu(){
        boolean salir = false;
        ServicioDeEscaneo sc = new ServicioDeEscaneo();
        ServicioDeEquipo servicioEquipo = new ServicioDeEquipo();
        ServicioDeJugador servicioDeJugador = new ServicioDeJugador();
        ServicioDeArchivos servicioDeArchivos = new ServicioDeArchivos();
        Equipos equipos = new Equipos();
        while (!salir) {
        System.out.println("Bienvenido a Fut5");
        System.out.println("1.Crear Equipo");
        System.out.println("2.Buscar Equipo");
        System.out.println("3.Buscar Jugador");
        System.out.println("4.Eliminar Equipo");
        System.out.println("5.Importar equipo");
        System.out.println("6.Exportar equipo");
        System.out.println("7.Salir");
        System.out.println("Su eleccion: ");
        String eleccion = sc.leerLinea();
        switch (eleccion){
                case "1" -> servicioEquipo.crearEquipo(equipos.equipos);
                case "2" -> {
                    System.out.println("Nombre del Equipo");
                    String nombre = sc.leerLinea();
                    servicioEquipo.buscarEquipo(equipos.equipos, nombre);
                }
                case "3" -> {
                    System.out.println("Nombre del Equipo");
                    String nombre = sc.leerLinea();
                    servicioDeJugador.buscarJugador(equipos.equipos, nombre);
                }
                case "4" -> {
                    System.out.println("Nombre del Equipo");
                    String nombre = sc.leerLinea();
                    servicioEquipo.eliminarEquipo(equipos.equipos, nombre);
                }
                case "5" -> servicioDeArchivos.importarEquipo(equipos.equipos);
                case "6" -> servicioDeArchivos.exportarEquipo(equipos.equipos);
            }
        }
    }
}
