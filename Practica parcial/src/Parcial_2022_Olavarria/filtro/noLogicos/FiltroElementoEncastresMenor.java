package Parcial_2022_Olavarria.filtro.noLogicos;

import Parcial_2022_Olavarria.Jugueteria;
import Parcial_2022_Olavarria.filtro.Filtro;

public class FiltroElementoEncastresMenor extends Filtro {
    private double encastres;

    public FiltroElementoEncastresMenor(double encastres) {
        this.encastres = encastres;
    }

    @Override
    public boolean cumple(Jugueteria elemento) {
        return elemento.getCantidadEncastres() < encastres;
    }
}
