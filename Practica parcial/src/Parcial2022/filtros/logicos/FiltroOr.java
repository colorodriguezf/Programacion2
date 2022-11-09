package Parcial2022.filtros.logicos;
import Parcial2022.Noticia;
import Parcial2022.filtros.Filtro;

public class FiltroOr extends Filtro {
    private Filtro f1;
    private Filtro f2;

    public FiltroOr(Filtro f1, Filtro f2) {
        this.f1 = f1;
        this.f2 = f2;
    }

    @Override
    public boolean cumple(Noticia noticia) {
        return f1.cumple(noticia) || f2.cumple(noticia);
    }

    
    
}
