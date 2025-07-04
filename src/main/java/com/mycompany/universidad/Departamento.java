package com.mycompany.universidad;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Departamento {
    private String nombre;
    private List<Profesor> profesores;
    private List<Curso> cursos;

    public Departamento(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public List<Profesor> getProfesores() {
        return profesores;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    // Contratar profesor (agregación: profesor puede existir fuera del departamento)
    public void contratarProfesor(Profesor profesor) {
        profesores.add(profesor);
    }

    // Despedir profesor por nombre
    public void despedirProfesor(String nombreProfesor) {
        Iterator<Profesor> it = profesores.iterator();
        while (it.hasNext()) {
            Profesor p = it.next();
            if (p.getNombre().equalsIgnoreCase(nombreProfesor)) {
                it.remove();
            }
        }
    }

    // Ofrecer curso
    public void ofrecerCurso(Curso curso) {
        cursos.add(curso);
    }

    // Obtener curso por código (útil para inscripción)
    public Curso buscarCursoPorCodigo(String codigo) {
        for (Curso c : cursos) {
            if (c.getCodigo().equalsIgnoreCase(codigo)) {
                return c;
            }
        }
        return null;
    }
}
