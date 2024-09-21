package com.example;

public class Tortuga extends Mascota{
    public Tortuga(String nombre, String especie, String raza, int edad, String tamaño, String color,
            String estadoDeSalud) {
        super(nombre, especie, raza, edad, tamaño, color, estadoDeSalud);
    }

    @Override
    public void hacerSonido() {
        System.out.println("...(Sin sonido)");
    }

    @Override
    public void alimentar() {
        System.out.println("Tu Tortuga/Mascota esta comiendo Hojas frescas");
    }

    @Override
    public void cuidar() {
        System.out.println("Sacas a tu Tortuga/Mascota y la dejas que ande por toda la casa...");
        System.out.println("Tu Mascota tiene el Caparazon sucio, abres un grifo y se lo limpias...");
        System.out.println("...");
    }
}
