package Parcial_2022_Olavarria.filtro.logicos;

import Parcial_2022_Olavarria.Jugueteria;
import Parcial_2022_Olavarria.filtro.Filtro;

public class FiltroAnd extends Filtro {
    private Filtro f1, f2;

    public FiltroAnd(Filtro f1, Filtro f2) {
        this.f1 = f1;
        this.f2 = f2;
    }

    @Override
    public boolean cumple(Jugueteria elemento) {
        return f1.cumple(elemento) && f2.cumple(elemento);
    }
}
