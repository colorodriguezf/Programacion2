package Ejercicio_2.Filtros.simples;

import Ejercicio_2.ElementoGasto;
import Ejercicio_2.Filtros.Filtro;

public class FiltroGasto extends Filtro {
    private double monto;

    public FiltroGasto(double monto) {
        this.monto = monto;
    }


    @Override
    public boolean cumple(ElementoGasto gasto) {
       return gasto.getMonto() > monto;
    }
    
}
