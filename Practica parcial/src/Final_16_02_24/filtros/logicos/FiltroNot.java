package Final_16_02_24.filtros.logicos;

import Final_16_02_24.Capitulo;
import Final_16_02_24.filtros.Filtro;

public class FiltroNot extends Filtro {
    private Filtro f;

    public FiltroNot(Filtro f) {
        this.f = f;
    }

    public Filtro getF() {
        return f;
    }

    public void setF(Filtro f) {
        this.f = f;
    }

    @Override
    public boolean cumple(Capitulo c) {
      return (!f.cumple(c));
    }

    
}
