package Parcial_1.Filtros;

import java.time.LocalDate;

import Parcial_1.PaqueteViaje;

public class FiltroFecha extends Filtro {
    private LocalDate fechaDada;

    public FiltroFecha(LocalDate fechaDada) {
        this.fechaDada = fechaDada;
    }
    
    @Override
    public boolean cumple(PaqueteViaje pp) {
        return pp.getFechaPago().compareTo(fechaDada) > 0;
    }
    
}
