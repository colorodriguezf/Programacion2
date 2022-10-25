package Parcial_1.Comparadores;

import java.util.Comparator;
import Parcial_1.PaqueteViaje;

public class ComparadorCompuesto implements Comparator<PaqueteViaje>{
    private Comparator<PaqueteViaje> cpv1;
    private Comparator<PaqueteViaje> cpv2;

    public ComparadorCompuesto(Comparator<PaqueteViaje>cpv1, Comparator<PaqueteViaje>cpv2) {
        this.cpv1 = cpv1;
        this.cpv2 = cpv2;
    }

    @Override
    public int compare(PaqueteViaje p1, PaqueteViaje p2) {
        int res = cpv1.compare(p1,p2);
        if (res == 0) {
            res = cpv2.compare(p1,p2);
        }
        return res;
    }
    
}
