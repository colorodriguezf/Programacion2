package Parcial_2022_Olavarria.filtro.noLogicos;

import Parcial_2022_Olavarria.Jugueteria;
import Parcial_2022_Olavarria.filtro.Filtro;

public class FiltroElementoPesoMenor extends Filtro {
    private double peso;

    public FiltroElementoPesoMenor(double peso) {
        this.peso = peso;
    }

    @Override
    public boolean cumple(Jugueteria elemento) {
        return elemento.getPeso() < peso;
    }
}
