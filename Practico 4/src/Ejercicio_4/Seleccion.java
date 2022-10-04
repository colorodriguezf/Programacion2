package Ejercicio_4;

import java.util.ArrayList;

public class Seleccion {
    private String nombre;
	private ArrayList<ContingenteSeleccion>contingentes;
	
	public Seleccion(String nombre) {
		super();
		this.nombre = nombre;
		this.contingentes = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public ArrayList<ContingenteSeleccion> getContingentes() {
		return new ArrayList<ContingenteSeleccion>(this.contingentes);
	}
	
	public void agregarContingente(ContingenteSeleccion contingente) {
		if(!this.contingentes.contains(contingente)) {
					this.contingentes.add(contingente);			
		}
	}
	
	public boolean estaDisponible(Entrenador entrenador) {
		if(this.contingentes.contains(entrenador)) {
			return entrenador.estaDisponible();			
		}
		return false;
	}

    public char[] estaDisponible(Futbolista futbolista) {
        return null;
    }

    public char[] estaDisponible(Masajista masajista) {
        return null;
    }

    public void agregarContingente(Entrenador entrenadorMismoId) {
    }

    public void agregarContingente(Masajista masajista) {
    }

    public void agregarContingente(Futbolista futbolista) {
    }
}
