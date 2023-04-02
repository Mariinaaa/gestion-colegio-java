package edu.ucj.programacion.pec1.marina_amaya;

public class Aula {
	private int numero;
    private int planta;
	private Alumno[] asientos;
	  
	public Aula(int numero, int planta) {
		this.numero = numero;
		this.planta = planta;
	    this.asientos = new Alumno[3];
	}
	
	//Get and set de Numero
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}

	//Get and set de Planta
	public int getPlanta() {
		return planta;
	}
	public void setPlanta(int planta) {
		this.planta = planta;
	}

	//Get and set de Asientos
	public Alumno[] getAsientos() {
	    return asientos;
	}
	public void setAsiento(Alumno alumno, int numAsiento) {    
		this.asientos[numAsiento] = alumno;
	}
}