package edu.ucj.programacion.pec1.marina_amaya;

import java.util.Scanner;

public class GestionColegios {
	public static void main(String[] args) {
		//Vamos a pedir por teclado que introduzca el nombre dirección,numero de aulas y numero de alumnos del colegio
		Scanner sc = new Scanner(System.in);
	    System.out.println("Introduce el nombre del colegio:");
	    String nombre = sc.nextLine();
	    System.out.println("Introduce la dirección del colegio:");
	    String direccion = sc.nextLine();
	    System.out.println("Introduce el número de aulas del colegio:");
	    int numAulas = sc.nextInt();
	    System.out.println("Introduce el número de alumnos:");
	    int numAlumnos = sc.nextInt();
	    
	    //Creamos el colegio
	    Aula[] aulas = new Aula[numAulas];
	    for(int i = 0; i < numAulas; i++) {
	    	aulas[i] = new Aula(i, 1);
	    }
	    Colegio colegio = new Colegio(nombre, direccion, aulas);
	    
	    //Creamos los alumnos
	    Alumno[] alumnos = UtilsColegio.crearAlumnos(numAlumnos);
	    
	    //Asignamos alumnos al colegio
	    for(Alumno alumno : alumnos) {
	    	colegio.asignarAlumno(alumno);
	    }
	}
}