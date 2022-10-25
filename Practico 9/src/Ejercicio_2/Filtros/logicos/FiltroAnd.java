package Ejercicio_2.Filtros.logicos;

import Ejercicio_2.ElementoGasto;
import Ejercicio_2.Filtros.Filtro;

public class FiltroAnd extends Filtro {
    private Filtro condicion1;
    private Filtro condicion2;

    public FiltroAnd(Filtro condicion1, Filtro condicion2) {
        this.condicion1 = condicion1;
        this.condicion2 = condicion2;
    }


    @Override
    public boolean cumple(ElementoGasto gasto) {
        return (condicion1.cumple(gasto) && condicion2.cumple(gasto));
    }
    
}
