package Parcial2022.filtros.logicos;
import Parcial2022.Noticia;
import Parcial2022.filtros.Filtro;

public class FiltroNot extends Filtro {
    private Filtro f1;

    public FiltroNot(Filtro f1, Filtro f2) {
        this.f1 = f1;
    }

    @Override
    public boolean cumple(Noticia noticia) {
        return !f1.cumple(noticia);
    }

    
    
}