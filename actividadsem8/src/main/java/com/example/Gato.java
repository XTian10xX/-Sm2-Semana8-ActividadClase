package com.example;

public class Gato extends Mascota {
    public Gato (String nombre, String especie, String raza, int edad, String tamaño, String color,
            String estadoDeSalud) {
        super(nombre, especie, raza, edad, tamaño, color, estadoDeSalud);
    }

    @Override
    public void hacerSonido() {
        System.out.println("Mauuu");
    }

    @Override
    public void alimentar() {
        System.out.println("Tu Gato come Croquetas (Comida para Gatos CatChow)");
    }

    @Override
    public void cuidar() {
        System.out.println("Tu Gato/Mascota esta abirrido...");
        System.out.println("Tu Mascota se esta limpiando por su propia cuenta...");
        System.out.println("...");
    }

    
}
