package Aseguradora_Strategy.filtros;

import Aseguradora_Strategy.SeguroSimple;

public class FiltroAnd extends Filtro{
    private Filtro f1;
    private Filtro f2;

    public FiltroAnd(Filtro f1, Filtro f2) {
        this.f1 = f1;
        this.f2 = f2;
    }

    @Override
    public boolean cumple(SeguroSimple s) {
       return f1.cumple(s) && f2.cumple(s);
    }

    
}
