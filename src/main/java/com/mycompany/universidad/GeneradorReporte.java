package com.mycompany.universidad;

import java.util.List;

public class GeneradorReporte {
    public void generar(Curso curso, List<Estudiante> estudiantes) {
        System.out.println("?Curso: " + curso.getNombre());
        System.out.println("Profesor: " +
            (curso.getProfesor() != null ? curso.getProfesor().getNombre() : "Sin asignar"));
        System.out.println("Estudiantes inscritos:");
        for (Estudiante e : estudiantes) {
            System.out.println("- " + e.getNombre());
        }
    }
}

