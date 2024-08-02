package Parcial_2023_Quequen.filtros.logicos;

import Parcial_2023_Quequen.SistemaCollections;
import Parcial_2023_Quequen.filtros.Filtro;

public class FiltroOr extends Filtro{
    private Filtro f1, f2;

    public FiltroOr(Filtro f1, Filtro f2) {
        this.f1 = f1;
        this.f2 = f2;
    }

    public Filtro getF1() {
        return f1;
    }

    public void setF1(Filtro f1) {
        this.f1 = f1;
    }

    public Filtro getF2() {
        return f2;
    }

    public void setF2(Filtro f2) {
        this.f2 = f2;
    }

    @Override
    public boolean cumple(SistemaCollections s) {
        return f1.cumple(s) || f2.cumple(s);
    }

    
}
