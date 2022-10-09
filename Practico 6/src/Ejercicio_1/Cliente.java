package Ejercicio_1;

import java.util.ArrayList;

public class Cliente {
    private String nombre;
	private ArrayList<Alquiler> alquileres;

	public Cliente(String nombre) {
		super();
		this.nombre = nombre;
		this.alquileres= new ArrayList<Alquiler>();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void agregarAlquiler(Alquiler alquilerNuevo) {
		this.alquileres.add(alquilerNuevo);
	}
	
	
	public boolean estaVencido() {
		for(int i=0; i<alquileres.size();i++) {
			Alquiler auxiliar = this.alquileres.get(i);
			if(auxiliar.estaVencido()) {
				return true;
			}
		}
		
		return false;
	}

	@Override
    public String toString() {
        return "Cliente [ " + nombre +"]";
    }
	
}
