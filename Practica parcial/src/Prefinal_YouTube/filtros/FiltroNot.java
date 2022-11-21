package Prefinal_YouTube.filtros;
import Prefinal_YouTube.Video;

public class FiltroNot extends Filtro {
    private Filtro f1;

    public FiltroNot(Filtro f1) {
        this.f1 = f1;
    }

    @Override
    public boolean cumple(Video v) {
        return !f1.cumple(v);
    }
    
}
