package Parcial_2022_Plus.logicos;
import Parcial_2022_Plus.Noticia;
import Parcial_2022_Plus.filtros.Filtro;

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