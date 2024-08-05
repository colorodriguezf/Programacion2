package Parcial_2023_TresArroyos.filtro.logico;

import Parcial_2023_TresArroyos.Empresa;
import Parcial_2023_TresArroyos.filtro.FiltroEmpresa;

public class FiltroNot extends FiltroEmpresa{
    private FiltroEmpresa f;

    public FiltroNot(FiltroEmpresa f) {
        this.f = f;
    }

    public FiltroEmpresa getF() {
        return f;
    }

    public void setF(FiltroEmpresa f) {
        this.f = f;
    }

    @Override
    public boolean cumple(Empresa pb) {
        return !f.cumple(pb);
    }
    
}
