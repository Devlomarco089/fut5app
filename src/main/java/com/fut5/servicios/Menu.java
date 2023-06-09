package com.fut5.servicios;


public class Menu {
    public static void MenuPrincipal(){
        System.out.println("Bienvenido a El menu de Fut 5 App tu mejor app de futbol"); 
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
        switch (opcion){
            case "1":
            crearequipo.crearEquipo();
            break;
            case "2":
            Buscar.buscarEquipo();
            break;
            case "3":
            Bjugador.buscarJugador();
            break;
            case "4":
            Eliminar.elimiarEquipo();
            break;
            case "5":
            Importar.impor();
            break;
            case "6":
            Exportar.Export();
            break;
            case "7":
            System.out.print("Gracias Por Usar Nuestros Servicios! Vuelva Pronto.");
            salir = true;
        }
        }
    }
}
