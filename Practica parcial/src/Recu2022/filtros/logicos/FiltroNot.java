package Recu2022.filtros.logicos;
import Recu2022.Noticia;
import Recu2022.filtros.Filtro;

public class FiltroNot extends Filtro{
    private Filtro f;

    public FiltroNot(Filtro f) {
        this.f = f;
    }

    @Override
    public boolean cumple(Noticia n) {
      return !f.cumple(n);
    }
    
}
