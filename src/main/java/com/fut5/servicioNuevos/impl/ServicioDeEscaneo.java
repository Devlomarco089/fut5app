package com.fut5.servicioNuevos.impl;

import java.util.Scanner;

public class ServicioDeEscaneo {
    Scanner sc = new Scanner(System.in);
    public String leerLinea(){
        return sc.nextLine();
    }
    public Integer leerInt(){
        return sc.nextInt();
    }
    public Double leerDouble(){
        return sc.nextDouble();
    }
}
