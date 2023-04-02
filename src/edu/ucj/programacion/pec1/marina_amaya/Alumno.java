package edu.ucj.programacion.pec1.marina_amaya;

public class Alumno {
	private String nombre;
	private String apellidos;
	private String dni;
	  
	public Alumno(String nombre, String apellidos, String dni) {
		this.nombre = nombre;
	    this.apellidos = apellidos;
	    this.dni = dni;
	 }
	
	//Get and set de Nombre
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	//Get and set de Apellidos
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	//Get and set de DNI
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}  
}