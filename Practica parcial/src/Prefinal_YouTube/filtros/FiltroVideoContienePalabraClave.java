package Prefinal_YouTube.filtros;
import Prefinal_YouTube.Video;

public class FiltroVideoContienePalabraClave extends Filtro{
    private String palabra;

    public FiltroVideoContienePalabraClave(String palabra) {
        this.palabra = palabra;
    }

    @Override
    public boolean cumple(Video v) {
       return v.getPalabrasClave().contains(palabra);
    }
    
}
