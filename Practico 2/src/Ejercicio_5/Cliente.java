package Ejercicio_5;

public class Cliente extends Persona {
    private Peluquero peluquero;
	
	public Cliente(String nombre, String apellido, Peluquero peluquero) {
		super(nombre, apellido);//constructor padre
		this.peluquero = peluquero;
	}

	public Peluquero getPeluquero() {
		return peluquero;
	}

	public void setPeluquero(Peluquero peluquero) {
		this.peluquero = peluquero;
	}
}
