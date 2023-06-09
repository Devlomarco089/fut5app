package com.fut5.servicios;

import java.util.Scanner;
public class Escanear {
    private static Scanner scanner = new Scanner(System.in);

    public static String leerLinea() {
        return scanner.nextLine();
    }
    public static int leerEnetero(){
        return scanner.nextInt();
    }
    public static double leerDoble(){
        return scanner.nextDouble();
    }

    public static void cerrarScanner() {
        scanner.close();
    }
}

