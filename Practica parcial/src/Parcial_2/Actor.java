package Parcial_2;

import java.time.LocalDate;
import java.util.ArrayList;

public class Actor {
    private String nombre;
    private String apellido;
	private LocalDate fechaNacimiento;
	private ArrayList<Peliculas>peliculasQueActuo;

	public Actor(String nombre, String apellido, LocalDate fechaNacimiento) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		this.peliculasQueActuo = new ArrayList<>();
	}

    public void addPelicula(Peliculas p) {
		peliculasQueActuo.add(p);
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
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
}
