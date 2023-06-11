package com.fut5.servicios;

import com.fut5.boostrap.Equipos;

public class Menu {

    CrearEquipo crearEquipo = new CrearEquipo();
    Buscar buscar = new Buscar();
    JugadorBuscar buscarJugador = new JugadorBuscar();
    Eliminar eliminar = new Eliminar();
    Importar importar = new Importar();
    Exportar exportar = new Exportar();
    Equipos equipos = new Equipos();
    public void MenuPrincipal(){
        System.out.println("Bienvenido al Menu de Fut 5 'Tu Mejor App de Futbol'");
        boolean salir = false;
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
        String opcion = Escanear.leerLinea();
            switch (opcion) {
                case "1" -> crearEquipo.crearEquipo(equipos.equipos);
                case "2" -> buscar.buscarEquipo(equipos.equipos);
                case "3" -> buscarJugador.encontrarJugador(equipos.equipos);
                case "4" -> eliminar.elimiarEquipo(equipos.equipos);
                case "5" -> importar.impor(equipos.equipos);
                case "6" -> exportar.Export(equipos.equipos);
                case "7" -> {
                    System.out.print("Gracias Por Usar Nuestros Servicios! Vuelva Pronto.");
                    salir = true;
                }
            }
        }
    }
}
