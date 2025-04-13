# Gestión de Colegio en Java

Este proyecto es una aplicación básica en Java que permite gestionar un colegio, donde se crean aulas y alumnos, y se asignan automáticamente los alumnos a los asientos disponibles.

## 📚 Descripción

El sistema permite:

- Crear un colegio indicando su nombre, dirección y número de aulas.
- Crear un listado de alumnos pidiendo su nombre, apellidos y DNI.
- Asignar automáticamente a los alumnos a los asientos libres en las aulas.
- Avisar si no hay asientos libres disponibles.

Cada aula tiene 3 asientos disponibles.

## 📁 Estructura del proyecto

- `Alumno.java`: Representa un alumno (nombre, apellidos, DNI).
- `Aula.java`: Representa un aula (número, planta, asientos).
- `Colegio.java`: Representa el colegio (nombre, dirección, aulas).
- `UtilsColegio.java`: Clase de utilidades para crear alumnos.
- `GestionColegios.java`: Clase principal que ejecuta el programa.
