package Persona;

import Persona.Persona;

public class Persona {

	private String nombre;
	private static Persona instancia;
	
	private Persona(String nombre) {
		this.nombre = nombre;
	}
	
	public static Persona crearInstancia(String nombre) {
		if (instancia == null) {
			instancia = new Persona(nombre);
		}
		
		else
		{
			System.out.println("El objeto ya está instanciado.");
		}
		
		return instancia;	
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
}
