package Ejercicio_4;

import java.time.LocalDate;

public class ContingenteSeleccion {
    private String nombre, apellido;
	private int nroPasaporte;
	private LocalDate fechaNac;
	private boolean viajando;
	private boolean concentrando;
	private boolean enPaisDeOrigen;

	public ContingenteSeleccion(String nombre, String apellido, int nroPasaporte, LocalDate fechaNac, boolean viajando,
			boolean concentrando, boolean enPaisDeOrigen) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.nroPasaporte = nroPasaporte;
		this.fechaNac = fechaNac;
		this.viajando = viajando;
		this.concentrando = concentrando;
		this.enPaisDeOrigen = enPaisDeOrigen;
	}


	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public int getNroPasaporte() {
		return nroPasaporte;
	}

	public LocalDate getFechaNac() {
		return fechaNac;
	}

	public boolean estaDisponible() {
		if(this.enPaisDeOrigen&&(!this.concentrando)) {
			return true;
		}
		return false;
	}
	
	public String getEstado() {
		if(this.concentrando) {
			return "Concentrando";
		}
		if(this.enPaisDeOrigen) {
			return "En pais de origen";
		}
		if(this.viajando) {
			return "Viajando";
		}
		return null;
	}

}
