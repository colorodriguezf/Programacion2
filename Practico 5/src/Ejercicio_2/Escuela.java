package Ejercicio_2;

import java.util.ArrayList;

public class Escuela {
    private String nombre;
	private ArrayList<Casa>casas;
	
	
	public Escuela(String nombre) {
		this.nombre = nombre;
		this.casas = new ArrayList<Casa>();
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public ArrayList<Casa> getCasas() {
		return new ArrayList<Casa>(this.casas);
	}
	
	public void agregarCasa(Casa casa) {
		if(!this.casas.contains(casa)) {
			casas.add(casa);
		}
	}
}
