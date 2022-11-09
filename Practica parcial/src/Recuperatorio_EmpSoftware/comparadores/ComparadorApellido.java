package Recuperatorio_EmpSoftware.comparadores;
import java.util.Comparator;
import Recuperatorio_EmpSoftware.ElemEmpresa;

public class ComparadorApellido implements Comparator<ElemEmpresa> {
    @Override           
     public int compare(ElemEmpresa e1, ElemEmpresa e2) {
           return e1.getApellido().compareTo(e2.getApellido());
        }
}
