package Ejercicio_1.comparadores;

import java.util.Comparator;
import Ejercicio_1.Socio;

public class ComparadorCuotaPaga implements Comparator<Socio>{

    @Override
    public int compare(Socio socio1, Socio socio2) {
       return Boolean.compare(socio1.isUltimaCuotaPpaga(), socio2.isUltimaCuotaPpaga());
    }
    
}
