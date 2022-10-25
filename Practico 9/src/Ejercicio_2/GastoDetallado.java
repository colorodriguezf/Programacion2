package Ejercicio_2;

import java.time.LocalDate;
import java.util.ArrayList;

import Ejercicio_2.Filtros.Filtro;

public class GastoDetallado extends ElementoGasto {
    private ArrayList<ElementoGasto> gastos;
	private ArrayList<String> caracteristicas;

    public GastoDetallado(String descripcion, LocalDate fecha, double monto) {
        super(descripcion, fecha, monto);
        this.caracteristicas = new ArrayList<>();
        this.gastos = new ArrayList<>();
    }

    public void agregarGasto(Gasto gasto) {
		gastos.add(gasto);
	}

    public ArrayList<ElementoGasto> getGastos() {
		return new ArrayList<ElementoGasto>(this.gastos);
	}

    @Override
    public double gastosTotalPorCriterio(Filtro f) {
       double total = 0;
       if (f.cumple(this)) {
        total = this.getMonto();
       }
       else {
        for (ElementoGasto elemento : gastos) {
            total += elemento.gastosTotalPorCriterio(f);
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
       else {
        for (ElementoGasto elemento : gastos) {
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
       return this.monto;
    }
    
}
