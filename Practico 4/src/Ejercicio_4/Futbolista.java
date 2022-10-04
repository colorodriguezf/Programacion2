package Ejercicio_4;

import java.time.LocalDate;

public class Futbolista extends Integrante {
    private String posicion;
    private String pierna_habil;
    private int goles_convertidos;

    private String piernaHabil;
	private int cantGoles;

	public Futbolista(String nombre, String apellido, int nroPasaporte, LocalDate fechaNac, boolean viajando,
			boolean concentrando, boolean enPaisDeOrigen, String piernaHabil, int cantGoles) {
		super(nombre, apellido, nroPasaporte, fechaNac, viajando, concentrando, enPaisDeOrigen);
		this.piernaHabil = piernaHabil;
		this.cantGoles = cantGoles;
	}

	public int getCantGoles() {
		return cantGoles;
	}

	public void sumarCantGoles() {
		this.cantGoles++;
	}

	public String getPiernaHabil() {
		return piernaHabil;
	}
}
