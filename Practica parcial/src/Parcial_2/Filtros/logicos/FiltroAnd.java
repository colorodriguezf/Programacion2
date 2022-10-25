package Parcial_2.Filtros.logicos;

import Parcial_1.PaqueteViaje;
import Parcial_1.Filtros.Filtro;

public class FiltroAnd extends Filtro {
    private Filtro f1;
    private Filtro f2;

    public FiltroAnd(Filtro f1, Filtro f2) {
        this.f1 = f1;
        this.f2 = f2;
    }

    @Override
    public boolean cumple(PaqueteViaje pp) {
        return f1.cumple(pp) && f2.cumple(pp);
    }
    
}
