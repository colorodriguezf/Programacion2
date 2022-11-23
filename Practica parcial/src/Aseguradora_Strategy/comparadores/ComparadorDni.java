package Aseguradora_Strategy.comparadores;
import java.util.Comparator;
import Aseguradora_Strategy.SeguroSimple;

public class ComparadorDni implements Comparator<SeguroSimple>{

    @Override
    public int compare(SeguroSimple s1, SeguroSimple s2) {
      return s1.getDni() - s2.getDni();
    }
    
}
