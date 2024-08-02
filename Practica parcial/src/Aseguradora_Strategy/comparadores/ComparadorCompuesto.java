package Aseguradora_Strategy.comparadores;
import java.util.Comparator;
import Aseguradora_Strategy.SeguroSimple;

public class ComparadorCompuesto implements Comparator<SeguroSimple>{
    private Comparator<SeguroSimple> c1;
    private Comparator<SeguroSimple> c2;

    public ComparadorCompuesto(Comparator<SeguroSimple> c1, Comparator<SeguroSimple>c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public int compare(SeguroSimple s1, SeguroSimple s2) {
        int res = c1.compare(s1, s2);
        if(res == 0) {
            res = c2.compare(s2, s1);
        }
        return res;
    }
    
}
