package com.example;

public class Main {
    public static void main(String[] args) {
        Perro perro1 = new Perro("Lucas", "Canino", "Perro Salchicha", 3, 
        "Pequeño", "Marrón", "Saludable");

        System.out.println("Informacion del Perro: -----------------------");
        System.out.println("Nombre del Perro: " + perro1.nombre);
        System.out.println("Especie del Perro: " + perro1.especie);
        System.out.println("Raza del Perro: " + perro1.raza);
        System.out.println("Edad del Perro: " + perro1.edad);
        System.out.println("Tamaño del Perro: " + perro1.tamaño);
        System.out.println("Color del Perro: " + perro1.color);
        System.out.println("Estado de Salud del Perro: " + perro1.estadoDeSalud);

        perro1.hacerSonido();
        perro1.alimentar();
        perro1.cuidar();

        Gato gato1 = new Gato("Quiken", "Felino", "Siames", 2, "Mediano",
        "Blanco y Negro", "Saludable");

        System.out.println("Informacion del Gato: -----------------------");
        System.out.println("Nombre del Gato: " + gato1.nombre);
        System.out.println("Especie del Gato: " + gato1.especie);
        System.out.println("Raza del Gato: " + gato1.raza);
        System.out.println("Edad del Gato: " + gato1.edad);
        System.out.println("Tamaño del Gato: " + gato1.tamaño);
        System.out.println("Color del Gato: " + gato1.color);
        System.out.println("Estado de Salud del Gato: " + gato1.estadoDeSalud);

        gato1.hacerSonido();
        gato1.alimentar();
        gato1.cuidar();

        Pajaro pajaro1 = new Pajaro("Minus", "Aviario", "Ninfa", 1, "Pequeño",
        "Amarillo, Rojo y Blanco", "Saludable");

        System.out.println("Informacion del Pajaro: -----------------------");
        System.out.println("Nombre del Pajaro: " + gato1.nombre);
        System.out.println("Especie del Pajaro: " + gato1.especie);
        System.out.println("Raza del Pajaro: " + gato1.raza);
        System.out.println("Edad del Pajaro: " + gato1.edad);
        System.out.println("Tamaño del Pajaro: " + gato1.tamaño);
        System.out.println("Color del Pajaro: " + gato1.color);
        System.out.println("Estado de Salud del Pajaro: " + gato1.estadoDeSalud);

        pajaro1.hacerSonido();
        pajaro1.alimentar();
        pajaro1.cuidar();

        Tortuga tortuga1 = new Tortuga("Raiden", "Testudineo", "Pintada", 54, "Pequeño",
        "Verde, Marron y Rojo", "Saludable");

        System.out.println("Informacion del Tortuga: -----------------------");
        System.out.println("Nombre de la Tortuga: " + gato1.nombre);
        System.out.println("Especie de la Tortuga: " + gato1.especie);
        System.out.println("Raza de la Tortuga: " + gato1.raza);
        System.out.println("Edad de la Tortuga: " + gato1.edad);
        System.out.println("Tamaño de la Tortuga: " + gato1.tamaño);
        System.out.println("Color de la Tortuga: " + gato1.color);
        System.out.println("Estado de Salud de la Tortuga: " + gato1.estadoDeSalud);

        tortuga1.hacerSonido();
        tortuga1.alimentar();
        tortuga1.cuidar();
    }
}