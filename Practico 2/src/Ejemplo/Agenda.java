package Ejemplo;
import java.util.ArrayList;

public class Agenda {

	private String nombre;
	private ArrayList<Reunion> reuniones;
	private ArrayList<Participante> participantes;

	public Agenda(String nombre) {
		this.nombre = nombre;
		this.reuniones = new ArrayList<>();
		this.participantes = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Reunion> getReuniones() {
		return new ArrayList<Reunion>(this.reuniones);
	}

	public void agregarReunionAagenda(Reunion reunion) {
		boolean hayConflicto = false;
		if (this.reuniones.isEmpty()) {
			this.reuniones.add(reunion);
		} else {
			for (Reunion r : this.reuniones) {
				if (r.tengoConflicto(reunion)) {
					hayConflicto=true;
				}
			}
			if(!hayConflicto) {
				this.reuniones.add(reunion);
				this.participantes.addAll(reunion.getParticipantes());
			}
		}
	}
}
