package Ejercicio_2;

import java.util.ArrayList;

public class Persona {
	private String nombre;
	private ArrayList<Casa>casasEnLaQueEstuvo;
	
	public Persona(String nombre) {
		this.nombre = nombre;
		this.casasEnLaQueEstuvo = new ArrayList<Casa>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected ArrayList<Casa> getCasasEnLaQueEstuvo() {
		return new ArrayList<Casa>(this.casasEnLaQueEstuvo);
	}
	
	public void agregarCasaEnLaQueEstuvo(Casa casa) {
		if(!this.casasEnLaQueEstuvo.contains(casa)) {
			this.casasEnLaQueEstuvo.add(casa);
		}
	}

	@Override
	public String toString() {
		return  nombre;
	}
	

}
