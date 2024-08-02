package Parcial_2022_Olavarria;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import Parcial_2022_Olavarria.filtro.Filtro;

public abstract class Jugueteria {
    protected String marca;

    public Jugueteria(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    
    public abstract double getPeso();
    public abstract String getColor();
    public abstract double getCantidadEncastres();
    public abstract double getCosto();

    public abstract ArrayList<Jugueteria> getElementosQue(Filtro f); //1
    public ArrayList<Jugueteria> getElementosFiltrados(Filtro f, Comparator<Jugueteria> c) { //1
        ArrayList<Jugueteria> cumplen = getElementosQue(f);
        Collections.sort(cumplen, c);
        
        return cumplen;
    }
}
