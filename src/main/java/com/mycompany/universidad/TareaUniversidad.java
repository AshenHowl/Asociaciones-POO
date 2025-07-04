package com.mycompany.universidad;

import java.util.ArrayList;
import java.util.List;

public class TareaUniversidad {

    public static void main(String[] args) {

        //Caso de uso 1: Crear universidad y departamentos (COMPOSICIÓN)
        Universidad unal = new Universidad("Universidad Nacional");
        unal.agregarDepartamento("Ingeniería");
        unal.agregarDepartamento("Matemáticas");

        //Caso de uso 2: Asignar profesores a departamentos (AGREGACIÓN)
        Profesor profeLaura = new Profesor("Laura", "Sistemas");
        Profesor profeJuan = new Profesor("Juan", "Cálculo");

        Departamento ingenieria = unal.getDepartamentos().get(0);
        Departamento matematicas = unal.getDepartamentos().get(1);

        ingenieria.contratarProfesor(profeLaura);
        matematicas.contratarProfesor(profeJuan);

        //Caso de uso 3: Crear curso, asignar profesor y registrar estudiantes
        Curso cursoProg = new Curso("CS101", "Programación I");
        cursoProg.asignarProfesor(profeLaura);
        profeLaura.asignarCurso(cursoProg);

        Estudiante est1 = new Estudiante("1001", "Carlos");
        Estudiante est2 = new Estudiante("1002", "Ana");

        cursoProg.registrarEstudiante(est1);
        cursoProg.registrarEstudiante(est2);

        //Caso de uso 4: Generar reporte del curso
        List<Estudiante> estudiantes = new ArrayList<>();
        estudiantes.add(est1);
        estudiantes.add(est2);

        GeneradorReporte generador = new GeneradorReporte();
        cursoProg.generarReporte(generador, estudiantes);

        // Mostrar cursos inscritos por estudiante
        System.out.println("Cursos inscritos por cada estudiante:");
        for (Estudiante e : estudiantes) {
            System.out.println("- " + e.getNombre() + ":");
            for (Curso c : e.getCursosInscritos()) {
                System.out.println("  > " + c.getNombre());
            }
        }
    }
}
