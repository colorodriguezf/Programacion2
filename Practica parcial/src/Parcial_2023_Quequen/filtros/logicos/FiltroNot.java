package Parcial_2023_Quequen.filtros.logicos;

import Parcial_2023_Quequen.SistemaCollections;
import Parcial_2023_Quequen.filtros.Filtro;

public class FiltroNot extends Filtro{
    private Filtro f;

    public FiltroNot(Filtro f) {
        this.f = f;
    }

    public Filtro getF() {
        return f;
    }

    public void setF(Filtro f) {
        this.f = f;
    }

    @Override
    public boolean cumple(SistemaCollections s) {
        return !f.cumple(s);
    }

    
}
