package com.example;

public class Perro extends Mascota {
    public Perro (String nombre, String especie, String raza, int edad, String tamaño, String color,
            String estadoDeSalud) {
        super(nombre, especie, raza, edad, tamaño, color, estadoDeSalud);
    }

    @Override
    public void hacerSonido() {
        System.out.println("Wooff");
    }

    @Override
    public void alimentar() {
        System.out.println("Tu mascota come Croquetas (Comida para Perros DogChow)");
    }

    @Override
    public void cuidar() {
        System.out.println("Sacas a tu Perro/Mascota a pasear...");
        System.out.println("Tu Mascota esta sucia, bañas a tu mascota...");
        System.out.println("Tu Mascota tiene un aliento terrible, le cepillas sus dientes...");
        System.out.println("...");
    }
}
