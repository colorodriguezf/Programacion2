package Ejercicio_1;

import java.time.LocalDate;

public class Alquiler {
    private Item item;
	private LocalDate fechaVencimiento;
	private Cliente cliente;
	
	public Alquiler(Item item, LocalDate fechaVencimiento, Cliente cliente) {
		super();
		this.item = item;
		this.fechaVencimiento = fechaVencimiento;
		this.cliente = cliente;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public LocalDate getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(LocalDate fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
	public void agregarAlquiler() {
		
		if(this.getItem().estaDisponible()) {
			this.cliente.agregarAlquiler(this);
		}
		
	}
	
	public boolean estaVencido() {
		if(this.getFechaVencimiento().isBefore(LocalDate.now())) {
			return true;
		}
		
		return false;
	}
	
}
