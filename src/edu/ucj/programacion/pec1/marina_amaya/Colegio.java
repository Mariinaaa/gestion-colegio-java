package edu.ucj.programacion.pec1.marina_amaya;

public class Colegio {
	private String nombre;
	private String direccion;
	private Aula[] aulas;
	  
	public Colegio(String nombre, String direccion, Aula[] aulas) {
		this.nombre = nombre;
	    this.direccion = direccion;
	    this.aulas = aulas;
	}

	//Get and set de Nombre
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	//Get and set de Dirreción
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	//Get and set de Aulas
	public Aula[] getAulas() {
		return aulas;
	}
	public void setAulas(Aula[] aulas) {
		this.aulas = aulas;
	}

	//Este código permite asignar un alumno a un asiento de un aula. Se recorren todos los aulas y se comprueba si hay
	//algún asiento libre, en caso afirmativo se asigna el alumno al asiento y se muestra un mensaje por pantalla  con la información.
	//En caso contrario se muestra un mensaje por pantalla indicando que no hay asientos libres.
	public void asignarAlumno(Alumno alumno) {
	    for(Aula aula : aulas) {
	      for(int i = 0; i < aula.getAsientos().length; i++) {
	        if(aula.getAsientos()[i] == null) {
	          aula.setAsiento(alumno, i);
	          System.out.println("El alumno " + alumno.getNombre() + " " + alumno.getApellidos() + " con DNI " + alumno.getDni() 
	          + " ha sido asignado al aula " + aula.getNumero() + " en el asiento " + i);
	          return;
	        }
	      }
	    }
	    System.out.println("No hay asientos libres en el colegio");
	  }
	}