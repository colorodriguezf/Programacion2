package Parcial_2022_Olavarria;

import java.util.ArrayList;

import Parcial_2022_Olavarria.filtro.Filtro;

public class ComboEspecial extends Combo {
    private Filtro f;

    public ComboEspecial(Filtro f, String marca, int descuento_porcentaje) {
        super(marca, descuento_porcentaje);
        this.f = f;
    }

    @Override
    public void setElementos(Jugueteria elemento) {
        if(f.cumple(elemento)){
            elementos.add(elemento);
        }
    } 
}
