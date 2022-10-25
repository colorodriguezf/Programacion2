package Ejercicio_2;

import java.time.LocalDate;
import java.util.ArrayList;

import Ejercicio_2.Filtros.Filtro;

public class GastoPendiente extends ElementoGasto {
        private double porcentajeActualizacionAnual;
	private int diasPendientes;
	private boolean fuePago;
	private ArrayList<ElementoGasto> gastos;
	private ArrayList<String> caracteristicas;

    public GastoPendiente(double porcentajeActualizacionAnual, boolean fuePago, String descripcion, LocalDate fecha, double monto) {
        super(descripcion, fecha, monto);
        this.porcentajeActualizacionAnual = porcentajeActualizacionAnual;
		this.fuePago = fuePago;
		this.gastos = new ArrayList<>();
		this.caracteristicas = new ArrayList<>();
    }

    public int getDiasPendientes() {
		int resultado = LocalDate.now().getYear() - this.getFecha().getYear();
		return resultado;
	}

	public boolean isFuePago() {
		return fuePago;
	}

    @Override
    public double gastosTotalPorCriterio(Filtro f) {
        double total = 0;
        if (f.cumple(this)) {
            total = this.getMonto();
        }
        if (gastos != null) {
            for (ElementoGasto elemento : gastos) {
                total += (double)elemento.gastosTotalPorCriterio(f);
            }
        }
        return total;
    }

    @Override
    public ArrayList<ElementoGasto> busquedaFecha(Filtro f) {
       ArrayList<ElementoGasto> resultado = new ArrayList<>();
       if (f.cumple(this)) {
         resultado.add(this);
       }
        if (gastos != null) {
        for (ElementoGasto elemento : gastos) {
            //Como el gasto puede ser detallado y tener mas gastos dentro,
            //se vuelve a preguntar a busqueda por fecha, y asi se forma el bucle
            resultado.addAll(elemento.busquedaFecha(f));
        }
       }
       return resultado;
    }

    @Override
    public ArrayList<String> getCaract() {
        return new ArrayList<String>(this.caracteristicas);
    }

    @Override
    public double getMonto() {
        if (this.isFuePago()) {
			return monto;
		} else {
			return monto + this.getPorcentajeActualizacionAnual();
		}
    }

    public double getPorcentajeActualizacionAnual() {
		return porcentajeActualizacionAnual * this.getDiasPendientes();
	}

    @Override
	public String toString() {
		return "GastoPendiente: " + this.getDiasPendientes()+" dias pendientes. Monto: " + this.getMonto();
	}
    
}
