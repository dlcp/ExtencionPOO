package com.example;

public class Main {
    public static void main(String[] args) {
        // No se puede instanciar la clase abstracta `Persona` directamente.

        // Usa una subclase concreta en su lugar.
        Estudiante estudiante1 = new Estudiante("Carlos", 30, "2023002");
        mostrarDetalles(estudiante1);  // No da error porque es una instancia de `Estudiante`.

        // Probando Estudiante
        Estudiante estudiante = new Estudiante("Ana", 22, "2022001");
        mostrarDetalles(estudiante);

        // Probando Profesor
        Profesor profesor = new Profesor("Luis", 40, "Matemáticas");
        mostrarDetalles(profesor);
    }

    public static void mostrarDetalles(Object obj) {
        if (obj instanceof IMostrable) {
            ((IMostrable) obj).mostrarDetalles();
        } else {
            System.out.println("El objeto no implementa IMostrable.");
        }
    }
}
