package com.eddcf;

public class Coche {

    String nombre;
    String matricula;
    int modelo;
    int costo;

    public Coche() {}

    public Coche(String nombre, String matricula, int modelo, int costo) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.modelo = modelo;
        this.costo = costo;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "nombre='" + nombre + '\'' +
                ", puesto='" + matricula + '\'' +
                ", edad=" + modelo +
                ", salario=" + costo +
                '}';
    }
}
