package com.fut5.dominio;

public class Jugador {
    private int id = 1;
    private String nombre;
    private String apellido;
    private double altura;
    private String posicion;
    private int goles;
    private int partidos;
    private boolean capitan;
    private int numeroCamiseta;
    private Equipo equipo;


    public Jugador(){

    }
    public Jugador(int id, String nombre, String apellido, double altura, String posicion, int goles, int partidos, boolean capitan, int numeroCamiseta){
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.altura = altura;
        this.posicion = posicion;
        this.goles = goles;
        this.partidos = partidos;
        this.capitan = capitan;
        this.numeroCamiseta = numeroCamiseta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }

    public int getPartidos() {
        return partidos;
    }

    public void setPartidos(int partidos) {
        this.partidos = partidos;
    }

    public boolean isCapitan() {
        return capitan;
    }

    public void setCapitan(boolean capitan) {
        this.capitan = capitan;
    }

    public int getNumeroCamiseta() {
        return numeroCamiseta;
    }

    public void setNumeroCamiseta(int numeroCamiseta) {
        this.numeroCamiseta = numeroCamiseta;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", altura=" + altura +
                ", posicion='" + posicion + '\'' +
                ", goles=" + goles +
                ", partidos=" + partidos +
                ", capitan=" + capitan +
                ", numeroCamiseta=" + numeroCamiseta +
                ", equipo=" + equipo +
                '}';
    }
}
