package com.example;

public class Estudiante extends Persona implements IMostrable {
    private String matricula;

    public Estudiante(String nombre, int edad, String matricula) {
        super(nombre, edad);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String presentar() {
        return String.format("Soy el estudiante %s y mi matrícula es %s.", getNombre(), matricula);
    }

    // Implementación del método de la interfaz
    @Override
    public void mostrarDetalles() {
        System.out.println(presentar());
    }

    @Override
    public String toString() {
        return presentar();
    }
}
