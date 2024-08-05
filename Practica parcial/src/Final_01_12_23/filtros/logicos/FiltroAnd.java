package Final_01_12_23.filtros.logicos;

import Final_01_12_23.ElementoAseguradora;
import Final_01_12_23.filtros.Filtro;

public class FiltroAnd implements Filtro {
    private Filtro f1;
    private Filtro f2;

    public FiltroAnd(Filtro f1, Filtro f2) {
        this.f1 = f1;
        this.f2 = f2;
    }

    public Filtro getF1() {
        return f1;
    }

    public void setF1(Filtro f1) {
        this.f1 = f1;
    }

    public Filtro getF2() {
        return f2;
    }

    public void setF2(Filtro f2) {
        this.f2 = f2;
    }

    @Override
    public boolean cumple(ElementoAseguradora ea) {
       return f1.cumple(ea) && f2.cumple(ea);
    }
}
