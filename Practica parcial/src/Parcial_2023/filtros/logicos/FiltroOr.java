package Parcial_2023.filtros.logicos;

import Parcial_2023.Empresa;
import Parcial_2023.Pieza;
import Parcial_2023.filtros.Filtro;

public class FiltroOr extends Filtro{
    private Filtro f1;
    private Filtro f2;

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
    public boolean cumple(Empresa p) {
        return f1.cumple(p) && f2.cumple(p);
    }


}
