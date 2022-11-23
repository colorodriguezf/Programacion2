package Aseguradora_Strategy.comparadores;
import java.util.Comparator;
import Aseguradora_Strategy.SeguroSimple;

public class ComparadorNroPoliza  implements Comparator<SeguroSimple> {

    @Override
    public int compare(SeguroSimple s1, SeguroSimple s2) {
        return s1.getNroPoliza() - s2.getNroPoliza();
    }
    
}
