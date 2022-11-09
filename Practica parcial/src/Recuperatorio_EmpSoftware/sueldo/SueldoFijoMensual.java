package Recuperatorio_EmpSoftware.sueldo;

import Recuperatorio_EmpSoftware.ElemEmpresa;

public class SueldoFijoMensual extends Sueldo {

    @Override
    public double gastoEnSueldo(ElemEmpresa e) {
      return e.getPrecio();
    }
}
