package Final_01_12_23.comparadores;

import java.util.Comparator;

import Final_01_12_23.ElementoAseguradora;

public class ComparadorCompuesto implements Comparator<ElementoAseguradora> {
    private Comparator<ElementoAseguradora> c1;
    private Comparator<ElementoAseguradora> c2;
    
    public ComparadorCompuesto(Comparator<ElementoAseguradora> c1, Comparator<ElementoAseguradora> c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    public Comparator<ElementoAseguradora> getC1() {
        return c1;
    }

    public void setC1(Comparator<ElementoAseguradora> c1) {
        this.c1 = c1;
    }

    public Comparator<ElementoAseguradora> getC2() {
        return c2;
    }

    public void setC2(Comparator<ElementoAseguradora> c2) {
        this.c2 = c2;
    }

    @Override
    public int compare(ElementoAseguradora ea1, ElementoAseguradora ea2) {
       int res = c1.compare(ea1, ea2);
       if (res == 0) {
        res = c2.compare(ea1, ea2);
       }
       return res;

    }
}
