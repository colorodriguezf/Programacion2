package Aseguradora_Strategy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import Aseguradora_Strategy.filtros.Filtro;

public abstract class ElementoAseguradora  {
    private int dni;

    public ElementoAseguradora(int dni) {
        this.dni = dni;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public abstract double getMontoAsegurado(); //1
    public abstract int getNroPoliza(); //2
    public abstract double getCosto(); //3
    public abstract ArrayList<SeguroSimple> getSegurosQue(Filtro f); //4
    public ArrayList<SeguroSimple> getSegurosQueOrdenados(Filtro f, Comparator<SeguroSimple> c) {
        ArrayList<SeguroSimple> seguros = this.getSegurosQue(f);
        Collections.sort(seguros, c);
        return seguros;
    }


}
