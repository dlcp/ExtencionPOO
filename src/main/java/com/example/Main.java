// src/main/java/com/example/Main.java
package com.example;

public class Main {
    public static void main(String[] args) {
        // Probando Persona
        Persona persona = new Persona("Carlos", 30);
        System.out.println(persona.presentar());

        // Probando Estudiante
        Estudiante estudiante = new Estudiante("Ana", 22, "2022001");
        System.out.println(estudiante.presentar());

        // Probando Profesor
        Profesor profesor = new Profesor("Luis", 40, "Matemáticas");
        System.out.println(profesor.presentar());
    }
}