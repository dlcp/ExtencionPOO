// src/test/java/com/example/PersonaTest.java
package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

public class PersonaTest {
    @Test
    @DisplayName("Prueba de encapsulamiento: getters y setters")
    public void testEncapsulamiento() {
        Persona persona = new Persona("Carlos", 30);
        System.out.println("Probando getters y setters:");
        System.out.println("Nombre inicial: " + persona.getNombre());
        System.out.println("Edad inicial: " + persona.getEdad());

        persona.setNombre("Carlos Modified");
        persona.setEdad(31);
        System.out.println("Nombre modificado: " + persona.getNombre());
        System.out.println("Edad modificada: " + persona.getEdad());

        assertEquals("Carlos Modified", persona.getNombre());
        assertEquals(31, persona.getEdad());
    }

    @Test
    @DisplayName("Prueba de herencia: Estudiante y Profesor")
    public void testHerencia() {
        Estudiante estudiante = new Estudiante("Ana", 22, "2022001");
        System.out.println("\nProbando herencia con Estudiante:");
        System.out.println(estudiante.presentar());
        
        Profesor profesor = new Profesor("Luis", 40, "Matemáticas");
        System.out.println("\nProbando herencia con Profesor:");
        System.out.println(profesor.presentar());
    }

    @Test
    @DisplayName("Prueba de polimorfismo: presentación de diferentes tipos")
    public void testPolimorfismo() {
        Persona[] personas = new Persona[]{
            new Persona("Carlos", 30),
            new Estudiante("Ana", 22, "2022001"),
            new Profesor("Luis", 40, "Matemáticas")
        };

        System.out.println("\nProbando polimorfismo:");
        for (Persona persona : personas) {
            System.out.println(persona.presentar());
        }
    }
}