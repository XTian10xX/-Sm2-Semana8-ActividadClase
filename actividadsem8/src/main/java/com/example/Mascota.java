

package com.example;

public abstract class Mascota {
    public static final String hacerSonido = null;
    String nombre;
    String especie;
    String raza;
    int edad;
    String tamaño;
    String color;
    String estadoDeSalud;

    public Mascota(String nombre, String especie, String raza, int edad, String tamaño, String color,
            String estadoDeSalud) {
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.edad = edad;
        this.tamaño = tamaño;
        this.color = color; 
        this.estadoDeSalud = estadoDeSalud;
    }

    public abstract void hacerSonido();

    public abstract void alimentar();

    public abstract void cuidar();

    public void mostrarInformacion() {
        System.out.println("Nombre de la Mascota: " + nombre);
        System.out.println("Nombre de la Especie: " + especie);
        System.out.println("Nombre de la Raza: " + raza);
        System.out.println("Edad de la Mascota: " + edad);
        System.out.println("Tamaño de la Mascota: " + tamaño);
        System.out.println("Color de la Mascota: " + color);
        System.out.println("Estado de Salud de la Mascota: " + estadoDeSalud);
    }
}
