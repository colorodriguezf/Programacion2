package Ejercicio_3;

public class EmpleadoComision extends Empleado {
    private double porcentajeXVenta;
	private int cantVentasRealizadas;

    public EmpleadoComision(String nombre, String apellido, double sueldo, double porcentajeXVenta,
			int cantVentasRealizadas) {
		super(nombre, apellido, sueldo);
		this.porcentajeXVenta = porcentajeXVenta;
		this.cantVentasRealizadas = cantVentasRealizadas;
	}

    public double getPorcentajeXVenta() {
        return porcentajeXVenta;
    }

    public void setPorcentajeXVenta(double porcentajeXVenta) {
        this.porcentajeXVenta = porcentajeXVenta;
    }

    public int getCantVentasRealizadas() {
        return cantVentasRealizadas;
    }

    public void setCantVentasRealizadas(int cantVentasRealizadas) {
        this.cantVentasRealizadas = cantVentasRealizadas;
    }

    public double getSueldo() {
		return super.getSueldo()+(this.cantVentasRealizadas*this.porcentajeXVenta);
	}
    

}
