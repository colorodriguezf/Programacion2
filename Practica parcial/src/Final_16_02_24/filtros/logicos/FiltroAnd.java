package Final_16_02_24.filtros.logicos;

import Final_16_02_24.Capitulo;
import Final_16_02_24.filtros.Filtro;

public class FiltroAnd extends Filtro {
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
    public boolean cumple(Capitulo c) {
        return f1.cumple(c) || f2.cumple(c);
    }

}
