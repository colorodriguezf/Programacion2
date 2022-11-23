package Recu2022.filtros.logicos;
import Recu2022.Noticia;
import Recu2022.filtros.Filtro;

public class FiltroAnd extends Filtro {
    private Filtro f1;
    private Filtro f2;

    public FiltroAnd(Filtro f1, Filtro f2) {
        this.f1 = f1;
        this.f2 = f2;
    }

    @Override
    public boolean cumple(Noticia n) {
        return f1.cumple(n) && f2.cumple(n);
    }
    
}
