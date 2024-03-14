package Parcial_2023;

import java.util.ArrayList;

import Parcial_2023.filtros.Filtro;

public class PiezaExclusiva extends Pieza {
    private int costo_exclusividad;
    public PiezaExclusiva(String nombre, String descripcion, int pla, String color, int segundos, int precio_grpla,
            int precio_segundo, int costo_exclusividad) {
        super(nombre, descripcion, pla, color, segundos, precio_grpla, precio_segundo);
        this.costo_exclusividad = costo_exclusividad;
    }

    public int getCosto_exclusividad() {
        return costo_exclusividad;
    }
    public void setCosto_exclusividad(int costo_exclusividad) {
        this.costo_exclusividad = costo_exclusividad;
    }

    @Override //2b
    public ArrayList<Pieza> getPiezasQue(Filtro f)  {
        return new ArrayList<Pieza>();
    }

    @Override //3
    public int getCosto() {
       int total = ((getPla() + getPrecio_grpla()) + (getSegundos() + getPrecio_segundo()));
       return total + costo_exclusividad;
    }

    
    
}
