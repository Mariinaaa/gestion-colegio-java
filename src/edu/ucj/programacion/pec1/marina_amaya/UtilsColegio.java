package edu.ucj.programacion.pec1.marina_amaya;

import java.util.Scanner;

public class UtilsColegio {
	public static Alumno[] crearAlumnos(int numAlumnos) {
		Scanner sc = new Scanner(System.in);
	    Alumno[] alumnos = new Alumno[numAlumnos];
	    for(int i = 0; i < numAlumnos; i++) { //bucle que itera numAlumnos, cada vez creando un nuevo objeto Alumno e inicializando sus atributos con valores únicos.
	    	//Pedimos por teclado que nos introduzacn el nombre, apellidos y DNI del alumno.
	    	System.out.println("Introduce el nombre del alumno " + (i + 1) + ":");
	    	String nombre = sc.nextLine();
	    	System.out.println("Introduce los apellidos del alumno " + (i + 1) + ":");
	    	String apellidos = sc.nextLine();
	    	System.out.println("Introduce el DNI del alumno " + (i + 1) + ":");
	    	String dni = sc.nextLine();
	    	alumnos[i] = new Alumno(nombre, apellidos, dni); //crear un nuevo objeto Alumno, es decir, un nuevo alumno, con los parámetros nombre, apellidos y dni, y guardarlo en la posición i del array alumnos.
	    }
	    return alumnos;
	}
}
