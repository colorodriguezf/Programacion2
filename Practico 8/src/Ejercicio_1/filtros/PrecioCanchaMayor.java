package Ejercicio_1.filtros;

import Ejercicio_1.Socio;

public class PrecioCanchaMayor extends Filtro{
    private double precio;

    public PrecioCanchaMayor(double precio) {
        this.precio = precio;
    }


    @Override
    public boolean cumple(Socio socio) {
        return  socio.pagoPrecioMayor(precio);
    }
    
}
