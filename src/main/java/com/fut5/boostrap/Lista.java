package com.fut5.boostrap;
import com.fut5.dominio.Jugador;
import com.fut5.dominio.Equipo;

public class Lista{
    /**
     * 
     */
    public static void crearBaseDatos(){
    Jugador jugador1 = new Jugador(1, "Lionel", "Messi", 1.70, "Delantero", 700, 800, true, 10);
    Jugador jugador2 = new Jugador(2, "Cristiano", "Ronaldo", 1.87, "Delantero", 750, 850, false, 7);
    Jugador jugador3 = new Jugador(3, "Neymar", "Junior", 1.75, "Delantero", 200, 300, false, 10);
    Jugador jugador4 = new Jugador(4, "Sergio", "Ramos", 1.84, "Defensor", 40, 600, true, 4);
    Jugador jugador5 = new Jugador(5, "Andrés", "Iniesta", 1.70, "Centrocampista", 60, 700, true, 8);
    Jugador jugador6 = new Jugador(6, "Kylian", "Mbappé", 1.78, "Delantero", 100, 150, false, 7);
    Jugador jugador7 = new Jugador(7, "Kevin", "De Bruyne", 1.81, "Centrocampista", 80, 300, false, 17);
    Jugador jugador8 = new Jugador(8, "Virgil", "van Dijk", 1.93, "Defensor", 20, 250, false, 4);
    Jugador jugador9 = new Jugador(9, "Mohamed", "Salah", 1.75, "Delantero", 150, 200, false, 11);
    Jugador jugador10 = new Jugador(10, "Manuel", "Neuer", 1.93, "Portero", 0, 600, true, 1);
    Jugador jugador11 = new Jugador(11, "Robert", "Lewandowski", 1.84, "Delantero", 350, 400, false, 9);
    Jugador jugador12 = new Jugador(12, "Luka", "Modric", 1.72, "Centrocampista", 40, 500, false, 10);
    Jugador jugador13 = new Jugador(13, "Harry", "Kane", 1.88, "Delantero", 200, 250, true, 9);
    Jugador jugador14 = new Jugador(14, "Eden", "Hazard", 1.73, "Delantero", 80, 150, false, 7);
    Jugador jugador15 = new Jugador(15, "Paul", "Pogba", 1.91, "Centrocampista", 50, 400, false, 6);
    Jugador jugador16 = new Jugador(16, "Raheem", "Sterling", 1.70, "Delantero", 100, 250, false, 7);
    Jugador jugador17 = new Jugador(17, "Gareth", "Bale", 1.85, "Delantero", 120, 200, false, 11);
    Jugador jugador18 = new Jugador(18, "Toni", "Kroos", 1.83, "Centrocampista", 70, 500, true, 8);
    Jugador jugador19 = new Jugador(19, "Antoine", "Griezmann", 1.76, "Delantero", 150, 300, false, 7);
    Jugador jugador20 = new Jugador(20, "Jan", "Vertonghen", 1.89, "Defensor", 10, 400, false, 5);
    Jugador jugador21 = new Jugador(21, "Thomas", "Müller", 1.86, "Delantero", 150, 350, false, 25);
    Jugador jugador22 = new Jugador(22, "Marcelo", "Vieira", 1.74, "Defensor", 30, 450, false, 12);
    Jugador jugador23 = new Jugador(23, "Romelu", "Lukaku", 1.91, "Delantero", 200, 300, true, 9);
    Jugador jugador24 = new Jugador(24, "Sergio", "Agüero", 1.72, "Delantero", 250, 350, false, 10);
    Jugador jugador25 = new Jugador(25, "Marco", "Reus", 1.80, "Delantero", 90, 200, false, 11);
    Jugador jugador26 = new Jugador(26, "David", "Alaba", 1.80, "Defensor", 15, 400, false, 27);
    Jugador jugador27 = new Jugador(27, "James", "Rodríguez", 1.80, "Centrocampista", 40, 250, false, 10);
    Jugador jugador28 = new Jugador(28, "David", "Silva", 1.70, "Centrocampista", 60, 450, false, 21);
    Jugador jugador29 = new Jugador(29, "N'Golo", "Kanté", 1.68, "Centrocampista", 20, 400, true, 7);
    Jugador jugador30 = new Jugador(30, "Thiago", "Silva", 1.83, "Defensor", 10, 300, false, 2);

    Equipo equipo1 = new Equipo("Real Madrid", "05/03/1902");
    Equipo equipo2 = new Equipo("FC Barcelona", "29/11/1899");
    Equipo equipo3 = new Equipo("Bayern Munich", "27/02/1900");
    Equipo equipo4 = new Equipo("Liverpool", "03/06/1892");
    Equipo equipo5 = new Equipo("Juventus", "01/11/1897");
    Equipo equipo6 = new Equipo("Paris Saint-Germain", "12/08/1970");
    // Agregar jugadores al equipo 1
    equipo1.agregarJugador(jugador1);
    equipo1.agregarJugador(jugador2);
    equipo1.agregarJugador(jugador3);
    equipo1.agregarJugador(jugador4);
    equipo1.agregarJugador(jugador5);

    // Agregar jugadores al equipo 2
    equipo2.agregarJugador(jugador6);
    equipo2.agregarJugador(jugador7);
    equipo2.agregarJugador(jugador8);
    equipo2.agregarJugador(jugador9);
    equipo2.agregarJugador(jugador10);

    // Agregar jugadores al equipo 3
    equipo3.agregarJugador(jugador11);
    equipo3.agregarJugador(jugador12);
    equipo3.agregarJugador(jugador13);
    equipo3.agregarJugador(jugador14);
    equipo3.agregarJugador(jugador15);

    // Agregar jugadores al equipo 4
    equipo4.agregarJugador(jugador16);
    equipo4.agregarJugador(jugador17);
    equipo4.agregarJugador(jugador18);
    equipo4.agregarJugador(jugador19);
    equipo4.agregarJugador(jugador20);

    // Agregar jugadores al equipo 5
    equipo5.agregarJugador(jugador21);
    equipo5.agregarJugador(jugador22);
    equipo5.agregarJugador(jugador23);
    equipo5.agregarJugador(jugador24);
    equipo5.agregarJugador(jugador25);

    // Agregar jugadores al equipo 6
    equipo6.agregarJugador(jugador26);
    equipo6.agregarJugador(jugador27);
    equipo6.agregarJugador(jugador28);
    equipo6.agregarJugador(jugador29);
    equipo6.agregarJugador(jugador30);
    Equipos.agregarEquipo(equipo1);
    Equipos.agregarEquipo(equipo2);
    Equipos.agregarEquipo(equipo3);
    Equipos.agregarEquipo(equipo4);
    Equipos.agregarEquipo(equipo5);
    Equipos.agregarEquipo(equipo6);
    }

}