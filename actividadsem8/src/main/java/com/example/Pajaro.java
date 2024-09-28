package com.example;

public class Pajaro extends Mascota{
    public Pajaro(String nombre, String especie, String raza, int edad, String tamaño, String color,
            String estadoDeSalud) {
        super(nombre, especie, raza, edad, tamaño, color, estadoDeSalud);
    }

    @Override
    public void hacerSonido() {
        System.out.println("Cawww");
    }

    @Override
    public void alimentar() {
        System.out.println("Tu Mascota esta comiendo Alpiste()");
    }

    @Override
    public void cuidar() {
        System.out.println("Sacas a tu Pajaro/Mascota fuera de su jaula...");
        System.out.println("Tu Mascota huele mal, abres un grifo y se baña solo...");
        System.out.println("...");
    }
}
