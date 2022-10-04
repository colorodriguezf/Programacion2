package Ejercicio_4;

import java.time.LocalDate;

public class Entrenador extends Integrante {
    private int id_federacion;

	public Entrenador(String nombre, String apellido, int nroPasaporte, LocalDate fechaNac, boolean viajando,
			boolean concentrando, boolean enPaisDeOrigen, int id_federacion) {
		super(nombre, apellido, nroPasaporte, fechaNac, viajando, concentrando, enPaisDeOrigen);
		this.id_federacion = id_federacion;
	}

	public int getIdFederacion() {
		return id_federacion;
	}
	
	public boolean equals(Object o1) {
		try {
			Entrenador e = ((Entrenador)o1);
			if(e.getIdFederacion() == this.getIdFederacion()) {
				return true;
			}
		} catch(Exception e) {
			return false;
		}
		return false;
	}
    
}
