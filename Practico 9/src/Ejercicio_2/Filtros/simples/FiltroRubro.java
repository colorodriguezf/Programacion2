package Ejercicio_2.Filtros.simples;

import Ejercicio_2.ElementoGasto;
import Ejercicio_2.Filtros.Filtro;

public class FiltroRubro extends Filtro{
    private String rubro;

    public FiltroRubro(String rubro) {
        this.rubro = rubro;
    }


    @Override
    public boolean cumple(ElementoGasto gasto) {
        return gasto.getDescripcion().equals(rubro);
    }
    
}
