package Ejercicio_2;

import java.time.LocalDate;
import java.util.ArrayList;

import Ejercicio_2.Filtros.Filtro;

public class Gasto  extends ElementoGasto{
    private ArrayList<String> caracteristicas;

    public Gasto(String descripcion, LocalDate fecha, double monto) {
        super(descripcion, fecha, monto);
        this.caracteristicas = new ArrayList<>();
    }

    public void agregarCaracteristica(String caracteristica) {
		caracteristicas.add(caracteristica);
	}
    @Override
    public double gastosTotalPorCriterio(Filtro f) {
        if (f.cumple(this)) {
            return this.getMonto();
        }
        return 0;
    }

    @Override
    public ArrayList<ElementoGasto> busquedaFecha(Filtro f) {
        ArrayList<ElementoGasto> gasto_fecha = new ArrayList<>();
        if (f.cumple(this)) {
            gasto_fecha.add(this);
        }
        return gasto_fecha;
    }

    @Override
    public ArrayList<String> getCaract() {
       return new ArrayList<String>(this.caracteristicas);
    }

    @Override
    public double getMonto() {
        return monto;
    }
    
}
