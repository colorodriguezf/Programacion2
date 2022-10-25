package Ejercicio_2.Filtros.simples;

import java.time.LocalDate;

import Ejercicio_2.ElementoGasto;
import Ejercicio_2.Filtros.Filtro;

public class FiltroFecha extends Filtro {
    private LocalDate fecha;

    public FiltroFecha(LocalDate fecha) {
        this.fecha = fecha;
    }


    @Override
    public boolean cumple(ElementoGasto gasto) {
        return gasto.getFecha().equals(fecha);
    }
    
}
