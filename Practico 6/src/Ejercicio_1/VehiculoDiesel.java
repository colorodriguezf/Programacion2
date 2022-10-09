package Ejercicio_1;

public class VehiculoDiesel extends Vehiculo{

    public VehiculoDiesel(String marca, int patente, boolean disponible) {
        super(marca, patente, disponible);
    }

    @Override
	public boolean estaDisponible() {
		return disponible;
	}

	@Override
	public void alquilado() {
		this.setAlquilado(false);
	}

	@Override
	public void devuelto() {
		this.setAlquilado(true);
	}
    
}
