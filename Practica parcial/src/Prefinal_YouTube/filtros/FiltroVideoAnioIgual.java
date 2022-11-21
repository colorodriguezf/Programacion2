package Prefinal_YouTube.filtros;
import Prefinal_YouTube.Video;

public class FiltroVideoAnioIgual extends Filtro {
    private int anio;

    public FiltroVideoAnioIgual(int anio) {
        this.anio = anio;
    }

    @Override
    public boolean cumple(Video v) {
        return v.getAnio() == anio;
    }
    
}
