package Ejemplo;

import java.time.LocalDateTime;

public class Participante {
	
	private String nombre, apellido, mail;
	private int telefono;
	
	public Participante(String nombre, String apellido, String mail, int telefono) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.mail = mail;
		this.telefono = telefono;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	
	public LocalDateTime getIniDe(Reunion reunion) {
		return reunion.getIni();
	}
	
	public LocalDateTime getFinDe(Reunion reunion) {
		return reunion.getFin();
	}
}
