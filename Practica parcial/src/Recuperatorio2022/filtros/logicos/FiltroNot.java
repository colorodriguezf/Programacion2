package Recuperatorio2022.filtros.logicos;
import Recuperatorio2022.Noticia;
import Recuperatorio2022.filtros.Filtro;

public class FiltroNot extends Filtro {
    private Filtro f1;

    public FiltroNot(Filtro f1) {
        this.f1 = f1;
    }

    @Override
    public boolean cumple(Noticia n) {
       return !f1.cumple(n);
    }
}
