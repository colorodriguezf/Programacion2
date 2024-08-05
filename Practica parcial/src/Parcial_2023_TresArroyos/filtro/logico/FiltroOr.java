package Parcial_2023_TresArroyos.filtro.logico;

import Parcial_2023_TresArroyos.Empresa;
import Parcial_2023_TresArroyos.filtro.FiltroEmpresa;

public class FiltroOr extends FiltroEmpresa{
    private FiltroEmpresa f1, f2;

    public FiltroOr(FiltroEmpresa f1, FiltroEmpresa f2) {
        this.f1 = f1;
        this.f2 = f2;
    }

    public FiltroEmpresa getF1() {
        return f1;
    }

    public void setF1(FiltroEmpresa f1) {
        this.f1 = f1;
    }

    public FiltroEmpresa getF2() {
        return f2;
    }

    public void setF2(FiltroEmpresa f2) {
        this.f2 = f2;
    }

    @Override
    public boolean cumple(Empresa pb) {
        return f1.cumple(pb) || f2.cumple(pb);
    }
}
