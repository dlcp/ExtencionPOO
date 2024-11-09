package com.example;

public class Profesor extends Persona {
    private String materia;

    public Profesor(String nombre, int edad, String materia) {
        super(nombre, edad);
        this.materia = materia;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    @Override
    public String presentar() {
        return String.format("Soy el profesor %s y enseño %s.", getNombre(), materia);
    }
}