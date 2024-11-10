package com.example;

public abstract class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Método abstracto
    public abstract String presentar();

    @Override
    public String toString() {
        return presentar();
    }

    // Método estático
    public static void imprimirTipoPersona(Persona persona) {
        System.out.println("El tipo de persona es: " + persona.getClass().getSimpleName());
    }
}
