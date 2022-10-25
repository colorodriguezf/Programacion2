package Parcial_1.Comparadores;

import java.util.Comparator;
import Parcial_1.PaqueteViaje;

public class ComparadorFecha implements Comparator<PaqueteViaje>{

    @Override
    public int compare(PaqueteViaje pv1, PaqueteViaje pv2) {
       int res = pv1.getFechaPago().compareTo(pv2.getFechaPago());
       if(res == 0){
        return 0;
       }
       else {
        return res;
       }
    }
    
}
