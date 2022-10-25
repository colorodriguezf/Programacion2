package Parcial_1.Comparadores;

import java.util.Comparator;
import Parcial_1.PaqueteViaje;

public class ComparadorCosto implements Comparator<PaqueteViaje>{

    @Override
    public int compare(PaqueteViaje pv1, PaqueteViaje pv2) {
        if (pv1.getCosto() > pv2.getCosto()) {
            return 1;
        }else if (pv1.getCosto() < pv2.getCosto()) {
            return -1;
        }
        else {
            return 0;
        }
    }
    
}
