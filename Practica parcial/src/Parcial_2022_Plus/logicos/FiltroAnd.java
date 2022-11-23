package Parcial_2022_Plus.logicos;
import Parcial_2022_Plus.Noticia;
import Parcial_2022_Plus.filtros.Filtro;

public class FiltroAnd extends Filtro {
    private Filtro f1;
    private Filtro f2;

    public FiltroAnd(Filtro f1, Filtro f2) {
        this.f1 = f1;
        this.f2 = f2;
    }

    @Override
    public boolean cumple(Noticia noticia) {
        return f1.cumple(noticia) && f2.cumple(noticia);
    }

    
    
}