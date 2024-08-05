package Parcial_2023_TresArroyos.filtro.noLogico;

import Parcial_2023_TresArroyos.Empresa;
import Parcial_2023_TresArroyos.filtro.FiltroEmpresa;

public class FiltroEmpleadosMenos extends FiltroEmpresa {
    int empleados;

    public FiltroEmpleadosMenos(int empleados) {
        this.empleados = empleados;
    }

    public int getEmpleados() {
        return empleados;
    }
    public void setEmpleados(int e) {
        empleados = e;
    }

    @Override
    public boolean cumple(Empresa pb) {
        return pb.getNempleados() < empleados;
    }
}
