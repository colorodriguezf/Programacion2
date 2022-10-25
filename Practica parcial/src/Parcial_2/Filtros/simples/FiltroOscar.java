package Parcial_2.Filtros.simples;

import Parcial_2.Peliculas;
import Parcial_2.Filtros.Filtro;

public class FiltroOscar extends Filtro {
    private int cantidadPremiosOscar;  

    public FiltroOscar(int cantidadPremiosOscar) {
        this.cantidadPremiosOscar = cantidadPremiosOscar;
    }


    @Override
    public boolean cumple(Peliculas p) {
        return p.getCantidadOscarGanados() > cantidadPremiosOscar;
    }
    
}
