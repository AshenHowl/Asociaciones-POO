package com.mycompany.universidad;

import java.util.ArrayList;
import java.util.List;

public class Profesor {
    private String nombre;
    private String especialidad;
    private List<Curso> cursosImpartidos;

    public Profesor(String nombre, String especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cursosImpartidos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public List<Curso> getCursosImpartidos() {
        return cursosImpartidos;
    }

    public void asignarCurso(Curso curso) {
        if (!cursosImpartidos.contains(curso)) {
            cursosImpartidos.add(curso);
        }
    }

    public void desasignarCurso(String codigoCurso) {
        cursosImpartidos.removeIf(c -> c.getCodigo().equalsIgnoreCase(codigoCurso));
    }
}
