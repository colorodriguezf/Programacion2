package Parcial_2023_TresArroyos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import Parcial_2023_TresArroyos.filtro.FiltroEmpresa;

public abstract class Empresa {
    protected String nombre;

    public Empresa(String nombre) {
        this.nombre = nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }

    public abstract ArrayList<String> getMateriales();
    public abstract int getNempleados();
    public abstract int getDtiempo();

    public abstract ArrayList<Empresa> getElementosCumple(FiltroEmpresa f);
    public abstract double getCosto();

    //Adicional
    public abstract Empresa getCopiaFiltrada(FiltroEmpresa f);
    
    public ArrayList<Empresa> getCopiaFiltradaOrdenada(FiltroEmpresa f, Comparator<Empresa> c) {
        ArrayList<Empresa> elementos = getElementosCumple(f);
        Collections.sort(elementos, c);
        return elementos;
    } 

}
