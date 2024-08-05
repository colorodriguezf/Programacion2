package Final_01_12_23.filtros.logicos;

import Final_01_12_23.ElementoAseguradora;
import Final_01_12_23.filtros.Filtro;

public class FiltroNot implements Filtro {
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
    public boolean cumple(ElementoAseguradora ea) {
       return !f.cumple(ea);
    }

    
}
