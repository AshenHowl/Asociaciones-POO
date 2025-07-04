# Proyecto Universidad - Programación Orientada a Objetos (POO)

Este proyecto demuestra cómo modelar correctamente relaciones entre clases en Java utilizando los principios de la Programación Orientada a Objetos.

## Estructura del Modelo

El diseño refleja las relaciones reales entre entidades universitarias usando:

- Composición: `Universidad` contiene completamente a `Departamento`.
- Agregación: `Departamento` tiene `Profesor`, pero los profesores pueden existir por sí mismos.
- Asociación: 
  - `Profesor` ↔ `Curso` (puede impartir varios cursos).
  - `Estudiante` → `Curso` (los estudiantes se inscriben a cursos).
- Dependencia:
  - `Curso` usa temporalmente a `Estudiante` y a `GeneradorReporte`, sin almacenar sus instancias.

