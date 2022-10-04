package Ejemplo;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Reunion {

	private String nombre, temaAtratar, lugar;
	private LocalDateTime ini, fin;
	private ArrayList<Participante> participantes;

	public Reunion(String nombre, String temaAtratar, String lugar, LocalDateTime ini, LocalDateTime fin) {
		this.nombre = nombre;
		this.temaAtratar = temaAtratar;
		this.lugar = lugar;
		this.ini = ini;
		this.fin = fin;
		this.participantes = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public String getTemaAtratar() {
		return temaAtratar;
	}

	public void setTemaAtratar(String temaAtratar) {
		this.temaAtratar = temaAtratar;
	}

	public LocalDateTime getIni() {
		return ini;
	}

	public void setIni(LocalDateTime ini) {
		this.ini = ini;
	}

	public LocalDateTime getFin() {
		return fin;
	}

	public void setFin(LocalDateTime fin) {
		this.fin = fin;
	}

	public ArrayList<Participante> getParticipantes() {
		return new ArrayList<Participante>(this.participantes);
	}

	public void agregarParticipanteAreunion(Participante user) {
		if (!this.participantes.contains(user)) {
			this.participantes.add(user);
		}
	}

	public boolean tengoConflicto(Reunion otraReunion) {
		boolean empiezaAntesDeQueTermine = (this.getIni().isBefore(otraReunion.getFin()));
		boolean terminaDespuesDeQueEmpieze = (this.getFin().isAfter(otraReunion.getIni()));
				
		if (empiezaAntesDeQueTermine && terminaDespuesDeQueEmpieze)
			return true;
		else
			return false;
	}
} 
    
