package Ejercicio_2;

import java.time.LocalDate;
import java.util.ArrayList;

import Ejercicio_2.Filtros.Filtro;

public abstract class ElementoGasto {
    protected String descripcion;
	protected LocalDate fecha;
	protected double monto;
	protected ArrayList<String> características;

    public ElementoGasto(String descripcion, LocalDate fecha, double monto) {
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.monto = monto;
    }

    public abstract double gastosTotalPorCriterio(Filtro f);

	public abstract ArrayList<ElementoGasto> busquedaFecha(Filtro f);

	public abstract ArrayList<String> getCaract();
	
	public abstract double getMonto();

    public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public LocalDate getFecha() {
		return fecha;
	}
    
}
