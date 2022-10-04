package Ejercicio_5;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Turno {
    private String nombre;
	private Cliente cliente;
	private ArrayList<Peluquero> peluqueros;
	private int precioTurno;
	private LocalDateTime inicioTurno;
	private int duracionTurno;
	

	public Turno(String nombre, Cliente cliente, int precio ,LocalDateTime inicio) {
		this.nombre = nombre;
		this.cliente = cliente;
		this.precioTurno = precio;
		this.inicioTurno = inicio;
		this.duracionTurno = 30;
		this.peluqueros = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public int getPrecioTurno() {
		return precioTurno;
	}

	public void setPrecioTurno(int precioTurno) {
		this.precioTurno = precioTurno;
	}

	public LocalDateTime getInicioTurno() {
		return inicioTurno;
	}

	public LocalDateTime getFinTurno() {
		return LocalDateTime.of(this.inicioTurno.getYear(), this.inicioTurno.getMonthValue(),
				this.inicioTurno.getDayOfMonth(), this.inicioTurno.getHour(),
				(this.inicioTurno.getMinute() + duracionTurno));
	}

	public void setInicioTurno(LocalDateTime inicioTurno) {
		this.inicioTurno = inicioTurno;
	}

	public int getDuracionTurno() {
		return duracionTurno;
	}

	public void setDuracionTurno(int duracionTurno) {
		this.duracionTurno = duracionTurno;
	}

	public ArrayList<Peluquero> getPeluqueros() {
		return new ArrayList<Peluquero>(this.peluqueros);
	}

	public void agregarPeluquero(Peluquero peluquero) {
		if (!this.peluqueros.contains(peluquero)) {
			this.peluqueros.add(peluquero);
		}
	}

	public boolean peluqueroDisponible(Turno t) {
		boolean disponible = true;

		for (Peluquero p : this.peluqueros) {
			if ((p.equals(this.cliente.getPeluquero()))) {
				if (p.getCantClientes() < p.getCantMaxClientesXpeluquero()) {
					p.setCantClientes(p.getCantClientes()+1);
				} else {
					disponible = false;
				}
			}
		}

		if(disponible) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Turno [nombre=" + nombre + ", inicioTurno=" + inicioTurno + "]";
	}
}
