package Parcial_2022_Olavarria.filtro.logicos;

import Parcial_2022_Olavarria.Jugueteria;
import Parcial_2022_Olavarria.filtro.Filtro;

public class FiltroNot extends Filtro {
    private Filtro f;

    public FiltroNot(Filtro f) {
        this.f = f;
    }

    @Override
    public boolean cumple(Jugueteria elemento) {
        return !f.cumple(elemento);
    }
}
