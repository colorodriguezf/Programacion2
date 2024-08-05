package Parcial_2023_TresArroyos.filtro.noLogico;

import Parcial_2023_TresArroyos.Empresa;
import Parcial_2023_TresArroyos.filtro.FiltroEmpresa;

public class FiltroDiasMenos extends FiltroEmpresa {
    private int dias;

    public FiltroDiasMenos(int dias) {
        this.dias = dias;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }
    
    @Override
    public boolean cumple(Empresa pb) {
        return pb.getDtiempo() < dias;
    }
}
