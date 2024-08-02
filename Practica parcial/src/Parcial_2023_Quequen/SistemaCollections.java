package Parcial_2023_Quequen;

import java.util.ArrayList;

import Parcial_2023_Quequen.filtros.Filtro;

public abstract class SistemaCollections {
    protected String nombre;

    public SistemaCollections(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract double getPeso_gr(); //a
    public abstract double getVolumen(); //b
    public abstract ArrayList<String> geCaracteristicas(); //c

    public abstract ArrayList<SistemaCollections> getColleccionQue(Filtro f); //2


}