package Ejercicio_4;

import java.time.LocalDate;

public class Masajista extends Integrante {
    private String tituloQuePosee;
	private LocalDate fechaInicioEnSeleccion;

	public Masajista(String nombre, String apellido, int nroPasaporte, LocalDate fechaNac, boolean viajando,
			boolean concentrando, boolean enPaisDeOrigen, String tituloQuePosee, LocalDate fechaInicioEnSeleccion) {
		super(nombre, apellido, nroPasaporte, fechaNac, viajando, concentrando, enPaisDeOrigen);
		this.tituloQuePosee = tituloQuePosee;
		this.fechaInicioEnSeleccion = fechaInicioEnSeleccion;
	}

	public String getTituloQuePosee() {
		return tituloQuePosee;
	}

	public LocalDate getFechaInicioEnSeleccion() {
		return fechaInicioEnSeleccion;
	}
	
	public int getCantAniosExperiencia() {
		int totalAños = 0;
		
		LocalDate hoy = LocalDate.now();
		int diferencia = hoy.getYear() - this.fechaInicioEnSeleccion.getYear();

		if (hoy.getYear() > this.fechaInicioEnSeleccion.getYear()) {
			if (hoy.getMonthValue() > this.fechaInicioEnSeleccion.getMonthValue()) {
				if (hoy.getDayOfMonth() > this.fechaInicioEnSeleccion.getDayOfMonth()) {
					totalAños = diferencia;
				} else {
					totalAños = diferencia + 1;
				}
			} else {
				totalAños = diferencia + 1;
			}
		}
		
		return totalAños;
		
	}
    
}
