package Ejercicio_1;

public abstract class Item {
    protected double precio;
	
	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
	public abstract boolean estaDisponible();
	public abstract void alquilado();
	public abstract void devuelto();

    
}
