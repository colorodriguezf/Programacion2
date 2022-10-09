package Ejercicio_1;

public abstract class Vehiculo extends Item {
    protected boolean disponible;
    private String marca;
    private int patente;
	
	public Vehiculo(String marca, int patente, boolean disponible) {
		super(); 
        this.marca = marca;  
        this.patente = patente; 
		this.disponible = disponible;
	}


    public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public int getPatente() {
		return patente;
	}


	public void setPatente(int patente) {
		this.patente = patente;
	}


	public boolean isAlquilado() {
		return !disponible;
	}

	public void setAlquilado(boolean alquilado) {
		this.disponible = alquilado;
	}
	
	public abstract boolean estaDisponible();
	public abstract void alquilado();
	public abstract void devuelto();
    
}
