package Parcial_2.Filtros.logicos;

import Parcial_2.Peliculas;
import Parcial_2.Filtros.Filtro;

public class FiltroNot extends Filtro{
    private Filtro f1;

    public FiltroNot(Filtro f1) {
        this.f1 = f1;
    }


    @Override
    public boolean cumple(Peliculas p) {
        return !f1.cumple(p);
    }
    
}
