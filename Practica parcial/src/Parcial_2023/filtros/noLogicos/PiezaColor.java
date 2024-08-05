package Parcial_2023.filtros.noLogicos;

import Parcial_2023.Empresa;
import Parcial_2023.filtros.Filtro;

public class PiezaColor extends Filtro {
    private String color;    

    public PiezaColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }


    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean cumple(Empresa p) {
       return p.getColor().equals(color);
    }


    
}
