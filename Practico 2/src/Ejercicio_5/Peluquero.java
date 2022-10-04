package Ejercicio_5;

public class Peluquero extends Persona {
    private int cantMaxClientesXpeluquero;
	private int cantClientes;
	
	public Peluquero(String nombre, String apellido) {        
		super(nombre, apellido);//llama al constructor padre
		this.cantMaxClientesXpeluquero = 1;
		this.cantClientes = 0;
	}
	
	public int getCantMaxClientesXpeluquero() {
		return cantMaxClientesXpeluquero;
	}

	public void setCantMaxClientesXpeluquero(int cantMaxClientesXpeluquero) {
		this.cantMaxClientesXpeluquero = cantMaxClientesXpeluquero;
	}

	public int getCantClientes() {
		return cantClientes;
	}

	public void setCantClientes(int cantClientes) {
		this.cantClientes = cantClientes;
	}

	public boolean equals(Object o1) {
		try {
			Peluquero p = ((Peluquero)o1);
			if(p.getNombre() == this.getNombre() && p.getApellido() == this.getApellido()) {
				return true;
			}
		} catch(Exception e) {
			return false;
		}
		return false;
	}
}
