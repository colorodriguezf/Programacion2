package Recuperatorio_EmpSoftware.sueldo;

import Recuperatorio_EmpSoftware.ElemEmpresa;

public class SueldoPorHora extends Sueldo {
    private int hs;

    public SueldoPorHora(int hs) {
      this.hs = hs;
   }
   
     @Override
    public double gastoEnSueldo(ElemEmpresa e) {
    return e.getPrecio() * hs;
  }
    
}
