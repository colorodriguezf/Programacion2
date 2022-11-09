package Recuperatorio_EmpSoftware.sueldo;

import Recuperatorio_EmpSoftware.ElemEmpresa;

public class SueldoHsExtra extends Sueldo {

    private Sueldo sueldo;
    private int hs;
    private double saldoxhora;
  
      public SueldoHsExtra(Sueldo sueldo, int hs, double saldoxhora) {
        this.sueldo = sueldo;
        this.hs = hs;
        this.saldoxhora = saldoxhora;
     }
   @Override
    public double gastoEnSueldo(ElemEmpresa e) {
      return (sueldo.gastoEnSueldo(e) + (hs*saldoxhora));
    }
    
}
