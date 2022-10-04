package Ejercicio_2;

public class Sensor {
    private String nombre_zona;
    private boolean activado;

    public Sensor(String nombre_zona, boolean activado) {
        this.nombre_zona = nombre_zona;
        this.activado = false;
    }

    public String getNombreZona() {
        return nombre_zona;
    }

    public void setNombreZona(String nombre_zona) {
        this.nombre_zona = nombre_zona;
    }

    public boolean isActivado() {
        return activado;
    }

    public void setActivado(boolean activado) {
        this.activado = activado;
    }

    @Override
	public String toString() {
		return "Sensor [nombre=" + nombre_zona + ", activado=" + activado + "]";
	}

}
