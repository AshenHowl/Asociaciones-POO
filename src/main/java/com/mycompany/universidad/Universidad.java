package com.mycompany.universidad;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Universidad {
    private String nombre;
    private List<Departamento> departamentos;

    public Universidad(String nombre) {
        this.nombre = nombre;
        this.departamentos = new ArrayList<>();
    }

    // Método para agregar un departamento
    public void agregarDepartamento(String nombreDepto) {
        departamentos.add(new Departamento(nombreDepto));
    }

    // Método para eliminar un departamento por nombre
    public void eliminarDepartamento(String nombreDepto) {
        Iterator<Departamento> it = departamentos.iterator();
        while (it.hasNext()) {
            Departamento d = it.next();
            if (d.getNombre().equalsIgnoreCase(nombreDepto)) {
                it.remove();
            }
        }
    }

    // Obtener todos los departamentos
    public List<Departamento> getDepartamentos() {
        return departamentos;
    }

    // Obtener todos los profesores de todos los departamentos
    public List<Profesor> obtenerTodosProfesores() {
        List<Profesor> todos = new ArrayList<>();
        for (Departamento d : departamentos) {
            todos.addAll(d.getProfesores());
        }
        return todos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

