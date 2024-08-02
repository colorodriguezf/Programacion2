package Parcial_2022_Olavarria.filtro.noLogicos;

import Parcial_2022_Olavarria.Jugueteria;
import Parcial_2022_Olavarria.filtro.Filtro;

public class FiltroElementoColor extends Filtro {
    private String color;

    public FiltroElementoColor(String color) {
        this.color = color;
    }

    @Override
    public boolean cumple(Jugueteria elemento) {
        return elemento.getColor().equals(color);
    }
}
