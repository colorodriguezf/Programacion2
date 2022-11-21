package Prefinal_YouTube.filtros;
import Prefinal_YouTube.Video;

public class FiltroAnd extends Filtro{
     Filtro f1;
    Filtro f2;

    public FiltroAnd(Filtro f1, Filtro f2) {
        this.f1 = f1;
        this.f2 = f2;
    }

    @Override
    public boolean cumple(Video v) {
        return f1.cumple(v) && f2.cumple(v);
    }
    
}
