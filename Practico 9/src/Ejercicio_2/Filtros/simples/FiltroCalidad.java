package Ejercicio_2.Filtros.simples;

import Ejercicio_2.ElementoGasto;
import Ejercicio_2.Filtros.Filtro;

public class FiltroCalidad extends Filtro{
    private String calidad;

    public FiltroCalidad(String calidad) {
        this.calidad = calidad;
    }


    @Override
    public boolean cumple(ElementoGasto gasto) {
        return gasto.getDescripcion().contains(calidad);
    }
    
}
