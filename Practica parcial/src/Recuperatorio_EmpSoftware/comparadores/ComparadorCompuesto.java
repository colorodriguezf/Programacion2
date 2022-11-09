package Recuperatorio_EmpSoftware.comparadores;
import java.util.Comparator;
import Recuperatorio_EmpSoftware.ElemEmpresa;

public class ComparadorCompuesto implements Comparator<ElemEmpresa> {
    private Comparator<ElemEmpresa> c1;
    private Comparator<ElemEmpresa> c2;
   
    public ComparadorCompuesto(Comparator<ElemEmpresa>c1, Comparator<ElemEmpresa> c2) {
     this.c1 = c1;
     this.c2 = c2;
    }
     @Override           
      public int compare(ElemEmpresa e1, ElemEmpresa e2) {
            int res = c1.compare(e1, e2);
            if (res == 0) {
                    c2.compare(e1, e2);
              }
           return res;
         }
}
