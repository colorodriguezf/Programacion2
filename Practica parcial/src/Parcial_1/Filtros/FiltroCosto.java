package Parcial_1.Filtros;

import Parcial_1.PaqueteViaje;

public class FiltroCosto extends Filtro{
    private double costo;

    public FiltroCosto(double costo) {
        this.costo = costo;
    }

    @Override
    public boolean cumple(PaqueteViaje pp) {
        return pp.getCosto() > costo;
    }
    
}
