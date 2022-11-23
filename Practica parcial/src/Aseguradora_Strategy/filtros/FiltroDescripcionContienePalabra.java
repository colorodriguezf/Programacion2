package Aseguradora_Strategy.filtros;

import Aseguradora_Strategy.SeguroSimple;

public class FiltroDescripcionContienePalabra extends Filtro{
    private String palabra;

    public FiltroDescripcionContienePalabra(String palabra) {
        this.palabra = palabra;
    }

    @Override
    public boolean cumple(SeguroSimple s) {
        return s.getDescripcion().contains(palabra);
    }

    
}
