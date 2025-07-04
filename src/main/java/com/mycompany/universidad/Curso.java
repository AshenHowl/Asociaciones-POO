package com.mycompany.universidad;

import java.util.List;

public class Curso {
    private String codigo;
    private String nombre;
    private Profesor profesor;

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    // Asociación con Profesor
    public void asignarProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    // Dependencia con Estudiante 
    public void registrarEstudiante(Estudiante estudiante) {
        System.out.println("Registrando estudiante: " + estudiante.getNombre());
        estudiante.agregarCurso(this);  // Estudiante guarda la asociación
    }

    // Dependencia con GeneradorReporte
    public void generarReporte(GeneradorReporte generador, List<Estudiante> estudiantes) {
        generador.generar(this, estudiantes); // Uso temporal del generador
    }
}
